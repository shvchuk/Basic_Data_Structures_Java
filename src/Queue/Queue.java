package Queue;

public class Queue<T extends Comparable<T>> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int count;

    public boolean isEmpty(){
        return this.firstNode == null;
    }

    public int size(){
        return this.count;
    }

    // O(1) complexity
    public void enqueue(T newData){
        this.count++;

        Node<T> oldLastNode = this.lastNode;
        this.lastNode = new Node<T>(newData);
        this.lastNode.setNextNode(null);

        if(isEmpty()) {
            this.firstNode = this.lastNode;
        } else {
            oldLastNode.setNextNode(this.lastNode);
        }
    }

    public T dequeue(){

        this.count--;

        T dataToDequeue = this.firstNode.getData();
        this.firstNode = this.firstNode.getNextNode();

        if(isEmpty()){
            this.lastNode = null;
        }

        return dataToDequeue;
    }

    public void traverse(){

        if(isEmpty()) return;

        Node<T> current = this.firstNode;
        while(current != null){
            System.out.print(current.getData()+" <--- ");
            current = current.getNextNode();
        }
    }

    public String firstNode(){
        return this.firstNode.toString();
    }

    public String lastNode(){
        return this.lastNode.toString();
    }

    public void orderTraversal(){
        if(isEmpty()) return;

        Node<T> current = this.firstNode;
        inOrderTraversal(current);
    }

    private void inOrderTraversal(Node<T> node) {
        if(node.getNextNode() != null){
            inOrderTraversal(node.getNextNode());
        }

        System.out.print(node + " -- > ");
    }

}
