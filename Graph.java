import java.util.ArrayList;

public class Graph implements IHash {
    private final int MAX_SIZE = 7;
    private Node[] Array = {null,null,null,null,null,null,null};
    private int length = 0;
    public void DisplayConnections (){
        String Step1;
        String Step2;
        String Step3;
        for(Node node: Array){
            ArrayList<String> StringArray = new ArrayList<>();
            if(node == null){
                continue;
            }else{
                for(Connector connector: node.returnConnections()){
                    Step1 = connector.getNode();
                    Step2 = connector.getWeight().toString();
                    Step3 = Step1 + " : " + Step2;
                    StringArray.add(Step3);
                    }
                System.out.println(node.getNode() + " : " + StringArray);
                }
            }
        }


    @Override
    public void add(String Value) {
        boolean Placed = false;
        int i = 1;
        Integer Address;
        Node node = new Node(Value);
        node.AddressGenerator(MAX_SIZE);
        Address = node.getAddress();
        for(Node CurrentNode : Array){
            if(CurrentNode == null){
                continue;
            }else if(CurrentNode.getKey() == node.getKey()){
                throw new IllegalArgumentException("A value with that key already exists within the dictionary");
            }
        }
        for(Node CurrentNode2 : Array){
            if(CurrentNode2 == null){
                continue;
            }else if(CurrentNode2.getNode().equals(node.getNode())){
                throw new IllegalArgumentException("Node with this name already exists");
            }
        }

        if(Array[Address] == null){
            Array[Address] = node;
            length++;
        }else {
            while (!Placed && i != MAX_SIZE - 1) {
                if (Array[(Address + i) % MAX_SIZE] == null) {
                    Array[(Address + i) % MAX_SIZE] = node;
                    node.setAddress(i, MAX_SIZE);
                    Placed = true;
                    length++;
                } else {
                    i++;
                }
            }
            if(!Placed){
                throw new UnsupportedOperationException("Dictionary Full");
            }
        }
    }

    public void addConnection(String node, String addnode, Integer weight){
        boolean found = false;
        boolean found2 = false;
        for(Node CurrentNode : Array){
            if(CurrentNode == null){
                continue;
            }else if(CurrentNode.getNode().equals(node)){
                found = true;
            }
        }

        if(!found){
            throw new IllegalArgumentException("A node with that name was not found");
        }

        for(Node Currentnode2 : Array){
            if(Currentnode2 == null){
                continue;
            }else if(Currentnode2.getNode().equals(addnode)){
                found2 = true;
            }
        }

        if(!found2){
            throw new IllegalArgumentException("Can not add connection, node does not exist");
        }

        for(Node CurrentNode : Array){
            if(CurrentNode == null){
                continue;
            }else if(CurrentNode.getNode().equals(node)){
                CurrentNode.addConnection(addnode, weight);
            }
        }

        for(Node Currentnode2 : Array){
            if(Currentnode2 == null){
                continue;
            }else if(Currentnode2.getNode().equals(addnode)){
                Currentnode2.addConnection(node, weight);
            }
        }
    }

    public Integer getKey(String node){
        boolean found = false;
        Integer keyvalue = null;

        for(Node Node : Array){
            if(Node == null){
                continue;
            } else if (Node.getNode().equals(node)) {
                found = true;
                keyvalue = Node.getKey();
                return keyvalue;
            }
        }
        if(!found){
            throw new IllegalArgumentException("Node with name given does not exist");
        }
        return keyvalue;
    }

    @Override
    public String item(int Key) {
        boolean Found = false;
        Node foundvalue = null;
        for(Node value : Array){
            if(value == null){
                continue;
            } else if (value.getKey() == Key) {
                Found = true;
                foundvalue = value;
                return value.getNode();
            }
        }
        if(!Found) {
            throw new IllegalArgumentException("Key does not exist (I think)");
        }
        return foundvalue.getNode();
    }

    @Override
    public void delete(int Key) {
        boolean found = false;
        if (!isEmpty()){
            for (Node value : Array) {
                if (value == null) {
                    continue;
                } else if (value.getKey() == Key) {
                    found = true;
                    Array[value.getAddress()] = null;
                    length--;
                }
            }
        }else {
            throw new IllegalArgumentException("Dictionary is empty");
        }
        if(!found){
            throw new IllegalArgumentException("Value with the inputted key was not found");
        }
    }

    @Override
    public boolean contains(int Key) {
        boolean found = false;
        for(Node value : Array){
            if(value == null){
                continue;
            } else if (value.getKey() == Key) {
                found = true;
                return found;
            }
        }
        return found;
    }

    @Override
    public int length() {
        int i = 0;
        for(Node value : Array){
            if(value == null){
                continue;
            }else{
                i++;
            }
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return (length == 0);
    }
}
