public class Connector {
    private Integer Weight;
    private String Node;

    public Connector(String node, Integer weight){
        this.Weight = weight;
        this.Node = node;
    }

    public String getNode(){
        return this.Node;
    }

    public Integer getWeight(){
        return this.Weight;
    }

    public void setWeight(Integer weight){
        this.Weight = weight;
    }

    public void setNode(String node){
        this.Node = node;
    }


}
