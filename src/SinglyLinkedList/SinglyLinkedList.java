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

    // deleting the first Node in the list
    public Node<T> deleteFirst(){
        Node<T> temp = first;
        first = first.nextNode;
        return temp;
    }

    // printing the contest of the list

    public void displayList(){
        System.out.println("List (first --> last) ");
        Node<T> current = first;
        while(current != null){
            current.displayNode();
            current = current.nextNode;
        }
        System.out.println();
    }


}
