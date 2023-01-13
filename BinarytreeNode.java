public class Node<T> implements Comparable<Node>{
    private T value;
    private Node<T> Left;
    private Node<T> Right;
    private Node<T> Previous;

    public Node(T value, Node<T> Right, Node<T> Left)
    {
        this.value = value;
        this.Right = Right;
        this.Left = Left;
    }

    @Override
    public String toString()
    {
        return value.toString();
    }

    public T getValue()
    {
        return value;
    }

    public void addPrevious(Node<T> previous){
        this.Previous = previous;
    }

    public Node<T> getPrevious()
    {
        return this.Previous;
    }

    public Node<T> getLeft()
    {
        return this.Left;
    }

    public void setLeft(Node<T> left)
    {
        this.Left = left;
    }

    public Node<T> getRight() {
        return Right;
    }

    public void setRight(Node<T> right) {
        this.Right = right;
    }

    @Override
    public int compareTo(Node node) {
        if(node.getValue() instanceof String){
            return ((String)this.getValue()).compareTo((String)node.getValue());
        }
        else{
            throw new UnsupportedOperationException("Data type not supported");
        }
    }
}
