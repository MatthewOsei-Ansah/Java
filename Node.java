import java.util.ArrayList;

public class Node {
    Integer Key;
    String Node;
    Integer Address;
    ArrayList<Connector> Connections = new ArrayList<>();

    public Node(String node){
        this.Node = node;
        int total = 0;
        char[] CharArray = this.Node.toCharArray();
        for(char character: CharArray){
            total += character;
        }
        this.Key = total;
    }

    public void addConnection(String node, Integer weight){
        Connector newConnection = new Connector(node, weight);
        Connections.add(newConnection);
    }

    public ArrayList<Connector> returnConnections(){
        return Connections;
    }

    public void getConnections(){
        for(Connector connector: Connections){
            System.out.println(connector.getNode() + " : " + connector.getWeight());
        }
    }

    public String getNode(){
        return this.Node;
    }

    public Integer getKey(){
        return this.Key;
    }

    public void AddressGenerator(int maxsize){
        Address = this.Key % maxsize;
    }

    public Integer getAddress(){
        return this.Address;
    }

    public void setAddress(int skip,int maxsize){
        this.Address = (skip + this.Address) % maxsize ;
    }

    public void Remove(){
        this.Key = null;
        this.Node = null;
        this.Address = null;
    }
}
