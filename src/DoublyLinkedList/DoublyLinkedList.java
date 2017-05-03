package DoublyLinkedList;

public class DoublyLinkedList<T extends Comparable<T>> {
    private Node<T> first;
    private Node<T> last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(T data){
        Node<T> newNode = new Node<T>(data);

        if(isEmpty()){
            last = newNode;
        } else {
            first.previousNode = newNode;
        }

        newNode.nextNode = first;
        this.first = newNode;
    }




}
