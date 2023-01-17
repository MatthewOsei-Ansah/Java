import java.util.ArrayList;

public class BinaryTree<T> {
    private Node<T> Root;
    private Node<T> Current;

    public void addnode(T value){
        int compare;
        Node<T> newValue = new Node<>(value, null, null);

        if(Root != null){
            compare = Current.compareTo(newValue);
            if(compare < 0){
                if(Current.getLeft() == null){
                    Current.setLeft(Current, newValue);
                    Current = Root;
                }else{
                    Current = Current.getLeft();
                    addnode(value);
                }
            } else if (compare > 0) {
                if(Current.getRight() == null){
                    Current.setRight(Current ,newValue);
                    Current = Root;
                }else{
                    Current = Current.getRight();
                    addnode(value);
                }
            }else{
                throw new IllegalArgumentException("A node with that name already exists within the tree");
            }
        }
        if(Root == null){
            Root = new Node<>(value, null, null);
            Current = Root;
        }
    }


    public void preOrderTraversal(Node<T> root) {
        if(root == null) {
            return;
        }
        System.out.print(root.getValue() + " ");
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
    }

    public void inOrderTraversal(Node<T> root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.getLeft());
        System.out.print(root.getValue() + " ");
        inOrderTraversal(root.getRight());
    }

    public void postOrderTraversal(Node<T> root) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.getLeft());
        postOrderTraversal(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    public Node<T> getRoot(){
        return Root;
    }
}

