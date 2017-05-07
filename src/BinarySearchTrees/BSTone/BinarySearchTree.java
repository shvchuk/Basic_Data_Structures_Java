package BinarySearchTrees.BSTone;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data){

        if( root == null){
            root = new Node<T>(data);
        } else {
            insertNode(data, root);
        }
    }

    @Override
    public T getMaxValue() {

        if (root == null) return null;

        return getMax(root);
    }

    @Override
    public T getMinValue(){

        if( root == null ) return null;

        return getMin(root);
    }

    @Override
    public void traversal() {

    }


    private void insertNode(T newData, Node<T> node) {

        if(newData.compareTo(node.getData()) < 0){
            if(node.getLeftChild() != null){
                insertNode(newData, node.getLeftChild());
            } else {
                Node<T> newNode = new Node<>(newData);
                node.setLeftChild(newNode);
            }
        } else{
            if(node.getRightChild() != null){
                insertNode(newData, node.getRightChild());
            } else {
                Node<T> newNode = new Node<>(newData);
                node.setRightChild(newNode);
            }

        }

    }

    @Override
    public void delete(T data) {

    }


    private T getMax(Node<T> node) {

        if(node.getRightChild() != null){
            return getMax(node.getRightChild());
        }

        return node.getData();
    }

    private T getMin(Node<T> node) {

        if(node.getLeftChild() != null){
            return getMin(node.getLeftChild());
        }

        return node.getData();
    }
}










