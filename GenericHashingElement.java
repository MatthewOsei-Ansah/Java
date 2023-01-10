package hashing;

public class Element<T, K> {
    K Key;
    T Value;
    private String StringValue;

    public Element(T value, K key){
        this.Value = value;
        this.Key =  key;
    }

    public T getValue(){
        return this.Value;
    }

    public K getKey(){
        return this.Key;
    }

    @Override
    public String toString(){
        StringValue = this.Value.toString();
        return StringValue;
    }
}
