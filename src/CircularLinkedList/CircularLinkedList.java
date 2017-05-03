package CircularLinkedList;

public class CircularLinkedList<T extends Comparable<T>> {
    private Node<T> first;
    private Node<T> last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }

    private boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(T data){
        Node<T> newNode = new Node<T>(data);

        if(isEmpty()){
            last = newNode;
        }
        newNode.nextNode = first; // newNode --> old first
        first = newNode; // newNode in first place
    }

    public void insertLast(T data){
        Node<T> newNode = new Node<T>(data);

        if(isEmpty()){
            first = newNode;
        } else {
            last.nextNode = newNode; // the next value of the last node will point to the new note
            last = newNode; // new node we created is now the last one in the list
        }
    }

    public Node<T> deleteFirst(){
        Node<T> temp = first;

        if(first.nextNode == null){
            last = null;
        }

        first = first.nextNode;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first --> last) ");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.nextNode;
        }
        System.out.println();
    }

}























