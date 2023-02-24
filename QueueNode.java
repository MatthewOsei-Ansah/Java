package com.company;

public class QueueNode<T> {
    private T Node;
    private int Weight;
    
    public QueueNode(T node, int weight){
        Node = node;
        Weight = weight;
    }
    
    public void setWeight(int weight){
        Weight = weight;
    }
    
    public int getWeight(){
        return Weight;
    }
    
    public T getNode(){
        return Node;
    }
    
    public void setNode(T node){
        Node = node;
    }
    
}
