package AVLTree;

public class AvlTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {

    }

    private Node<T> rightRotation(Node<T> node){

        System.out.println("Rotating to the right...");

        Node<T> tempLeftNode = node.getLeftChild();
        Node<T> t = tempLeftNode.getRightChild();

        tempLeftNode.setRightChild(node);
        node.setLeftChild(t);

        node.setHeight( Math.max( height(node.getLeftChild()), height(node.getRightChild())) + 1);
        tempLeftNode.setHeight( Math.max( height(tempLeftNode.getLeftChild()), height(tempLeftNode.getRightChild())) + 1);

        return tempLeftNode;
    }

    private Node<T> leftRotation(Node<T> node){

        System.out.println("Rotating to the left...");

        Node<T> tempRightNode = node.getRightChild();
        Node<T> t = tempRightNode.getLeftChild();

        tempRightNode.setLeftChild(node);
        node.setRightChild(t);

        node.setHeight( Math.max( height(node.getLeftChild()), height(node.getRightChild())) + 1);
        tempRightNode.setHeight( Math.max( height(tempRightNode.getLeftChild()), height(tempRightNode.getRightChild())) + 1);

        return tempRightNode;
    }


    private int height(Node<T> node){
        if(node == null){
            return -1;
        }

        return node.getHeight();

    }
    // calculating the "balance" of the given node
    // meaning the difference between left and right paths
    private int getBalance(Node<T> node){

        if( node == null) return 0;

        return height(node.getLeftChild()) - height(node.getRightChild());
    }

    @Override
    public void traverse() {

        if( root == null) return;

        inOrderTraversal(root);

    }

    private void inOrderTraversal(Node<T> node) {

        if(node.getLeftChild() != null){
            inOrderTraversal(node.getLeftChild());
        }

        System.out.println(node);

        if(node.getRightChild() != null){
            inOrderTraversal(node.getRightChild());
        }
    }
}
