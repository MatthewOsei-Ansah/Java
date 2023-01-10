package hashing;

import java.util.Arrays;

public class Hashing<V, K>{
    private final int MAX_SIZE = 11;
    private Element[] Array = {null,null,null,null,null,null,null,null,null,null,null};
    private int length = 0;

    public String Display()
    {
        int i = 0;
        String ReturnValue;
        String[] StringArray = {null,null,null,null,null,null,null,null,null,null,null};
        for(Element<V, K> value: Array){
            if(value == null){
                StringArray[i] = null;
                i++;
            }else{
                StringArray[i] = value.toString();
                i++;
            }
        }

        ReturnValue = Arrays.toString(StringArray);
        return ReturnValue;
    }


    public void add(V Value, K Key) {
        boolean Placed = false;
        int i = 1;
        Integer Address;
        Element<V, K> element = new Element<V, K>(Value, Key);
        Address = Math.abs(element.getKey().hashCode());
        Address = Address % MAX_SIZE;
        for(Element<V, K> value : Array){
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
                    Address = (Address + i) % MAX_SIZE;
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


    public V item(K Key) {
        int i = 0;
        boolean Found = false;
        Element<V, K> foundvalue = null;
        for(Element<V, K> value : Array){
            if(value == null){
                continue;
            } else if (value.getKey() == Key) {
                Found = true;
                foundvalue = value;
                return (V) value.getValue();
            }
        }
        if(!Found) {
            throw new IllegalArgumentException("Key does not exist (I think)");
        }
        return foundvalue.getValue();
    }


    public void delete(K Key) {
        Integer Address;
        boolean found = false;
        if (!isEmpty()){
            for (Element<V, K> value : Array) {
                if (value == null) {
                    continue;
                } else if (Math.abs(value.getKey().hashCode()) == Math.abs(Key.hashCode())) {
                    found = true;
                    Address = Math.abs((value.getKey().hashCode() % MAX_SIZE));
                    Array[Address] = null;
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


    public boolean contains(K Key) {
        boolean found = false;
        for(Element<V, K> value : Array){
            if(value == null){
                continue;
            } else if (Math.abs(value.getKey().hashCode()) == Math.abs(Key.hashCode())) {
                found = true;
                return found;
            }
        }
        return found;
    }


    public int length() {
        int i = 0;
        for(Element<V, K> value : Array){
            if(value == null){
                continue;
            }else{
                i++;
            }
        }
        return i;
    }


    public boolean isEmpty() {
        return (length == 0);
    }
}
