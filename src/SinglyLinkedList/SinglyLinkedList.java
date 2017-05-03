package SinglyLinkedList;

public class SinglyLinkedList<T extends Comparable<T>> {
    private Node<T> first;

    public SinglyLinkedList(){

    }

    public boolean isEmpty(){
        return (first == null);
    }

    // used to insert at the beginning of the list
    public void insertFirst(T data){
        Node<T> newNode = new Node<T>(data);
        newNode.nextNode = first;
        first = newNode;
    }
}
