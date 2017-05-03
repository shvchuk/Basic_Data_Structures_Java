package DoublyLinkedList;

public class Node<T extends Comparable<T>> {
    private T data;
    public Node<T> nextNode;
    public Node<T> previousNode;

    public Node(T data) {
        this.data = data;
    }

    public void displayNode(){
        System.out.println("{ " + data + " }");
    }
}
