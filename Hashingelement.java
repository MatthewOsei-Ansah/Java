package hashing;

public class Element {
    Integer Key;
    String Value;
    Integer Address;
    public Element(String value, Integer key){
        this.Value = value;
        this.Key =  key;
    }

    public String getValue(){
        return this.Value;
    }

    public Integer getKey(){
        return this.Key;
    }

    public Integer AddressGenerator(int maxsize){
        Address = this.Key % maxsize;
        return Address;
    }

    public Integer getAddress(){
        return this.Address;
    }

    public void Remove(){
        this.Key = null;
        this.Value = null;
        this.Address = null;
    }
}
