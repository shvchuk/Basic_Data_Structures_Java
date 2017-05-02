package LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data) {

        ++this.sizeOfList; // zwiększamy od razu rozmiar listy

        if( root == null ) {
            this.root = new Node<T>(data);
        } else {
            insertDataAtBeginning(data);
        }
    }

    // O(1) Time Complexity
    private void insertDataAtBeginning(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNextNode(root);
        this.root = newNode;

    }

    // O(N) Time Complexity
    private void insertDataAtEnd(T data, Node<T> node){
        if(node.getNextNode() != null ) {
            insertDataAtEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<T>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {

    }

    @Override
    public void traverseList() {

    }

    @Override
    public int size() {
        return 0;
    }
}
