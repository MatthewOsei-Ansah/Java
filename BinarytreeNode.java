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


    public Node<T> getLeft()
    {
        return this.Left;
    }

    public void setLeft(Node<T> node, Node<T> left)
    {
        left.setPrevious(node);
        this.Left = left;
    }

    public Node<T> getRight() {
        return Right;
    }

    public void setPrevious(Node<T> previous){
        this.Previous = previous;
    }

    public Node<T> getPrevious() {
        return Previous;
    }

    public void setRight(Node<T> node , Node<T> right) {
        right.setPrevious(node);
        this.Right = right;
    }

    @Override
    public int compareTo(Node node ) {
        if(node.getValue() instanceof String){
            return ((String)node.getValue()).compareTo((String)this.getValue());
        } else if (node.getValue() instanceof  Character) {
            return ((Character) node.getValue()).compareTo((Character)this.getValue());
        } else if (node.getValue() instanceof Integer) {
            return ((Integer) node.getValue()).compareTo((Integer)this.getValue());
        } else{
            throw new UnsupportedOperationException("Data type not supported");
        }
        }
    }

