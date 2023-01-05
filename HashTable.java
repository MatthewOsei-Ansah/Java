package hashing;



public class Hashing implements IHash {
    private final int MAX_SIZE = 11;
    private Element[] Array = {null,null,null,null,null,null,null,null,null,null,null};
    private int length = 0;

    public String[] asArray()
    {
        int i = 0;
        String[] StringArray = {null,null,null,null,null,null,null,null,null,null,null};
        for(Element value: Array){
            if(value == null){
                StringArray[i] = null;
                i++;
            }else{
                StringArray[i] = value.getValue();
                i++;
            }
        }
        return StringArray;
    }    

    @Override
    public void add(int Key, String Value) {
        boolean Placed = false;
        int i = 1;
        Integer Address;
        Element element = new Element(Value, Key);
        element.AddressGenerator(MAX_SIZE);
        Address = element.getAddress();
            for(Element value : Array){
                if(value == null){
                    continue;
                }else if(value.getKey() == element.getKey()){
                    throw new IllegalArgumentException("A value with that key already exists within the dictionary");
                }
            }

            if(Array[Address] == null){
                Array[Address] = element;
                length++;
            }else {
                while (!Placed && i != MAX_SIZE - 1) {
                    if (Array[(Address + i) % MAX_SIZE] == null) {
                        Array[(Address + i) % MAX_SIZE] = element;
                        element.setAddress(i, MAX_SIZE);
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

    @Override
    public String item(int Key) {
        int i = 0;
        boolean Found = false;
        Element foundvalue = null;
        for(Element value : Array){
            if(value == null){
                continue;
            } else if (value.getKey() == Key) {
                Found = true;
                foundvalue = value;
                return value.getValue();
            }
        }
        if(!Found) {
            throw new IllegalArgumentException("Key does not exist (I think)");
        }
        return foundvalue.getValue();
    }

    @Override
    public void delete(int Key) {
        boolean found = false;
        if (!isEmpty()){
            for (Element value : Array) {
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
        for(Element value : Array){
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
        for(Element value : Array){
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
