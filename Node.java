package hashing;

import java.util.ArrayList;

public class Node {
    Integer Key;
    String Node;
    Integer Address;
    ArrayList<Connector> Connections = new ArrayList<>();

    public Node(String node, Integer key){
        this.Node = node;
        this.Key =  key;
    }

    public void addConnection(String node, Integer weight){
        Connector newConnection = new Connector(node, weight);
        Connections.add(newConnection);
    }

    public void getConnections(){
        for(Connector node: Connections){
            System.out.println(node.getNode() + ": " + node.getWeight());
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
