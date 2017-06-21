package StosOgraniczony;

public class StosOgraniczony<T extends Comparable<T>> {

    private Node<T> root;
    public int maxSize;
    private int currentSize;

    public StosOgraniczony(int maxSize) {
        this.maxSize = maxSize;
        this.root = null;
        this.currentSize = 0;
    }

    public void push(T data){

        if( this.currentSize == this.maxSize){
            System.out.println("The Stack is full. Node { "
                    + data.toString() + " } wasn't pushed on the Stack.");
        } else {
            if (this.root == null){
                this.root = new Node<T>(data);
            } else {
                Node<T> oldRoot = this.root;
                this.root = new Node<T>(data);
                this.root.setNextNode(oldRoot);
            }
            ++this.currentSize;
        }
    }

    public Node<T> pop(){
        if( isEmpty() ){
            return null;
        } else {
            --this.currentSize;
            Node<T> nodeToPop = this.root;
            this.root = this.root.getNextNode();
            return nodeToPop;
        }
    }

    public int size(){
        return this.currentSize;
    }

    private boolean isEmpty() {
        return this.root == null;
    }

    public void clear(){
        if ( !isEmpty() ) {
            this.root.setNextNode(null);
            this.root = null;
            this.currentSize = 0;
        }
    }
}
