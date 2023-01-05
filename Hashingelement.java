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
        this.Value = null;
        this.Address = null;
    }
}
