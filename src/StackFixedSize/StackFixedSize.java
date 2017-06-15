package StackFixedSize;

public class StackFixedSize<T extends Comparable<T>> {

    private Node<T> first; // reference to the root of the stack
    private Node<T> last;
    public int maxSize; // stack fixed size declared by the user
    private int currentSize; // tracking the size of the stack

    public StackFixedSize(int maxSize) {
        this.maxSize = maxSize;
        this.first = null;
        this.last = null;
    }

    public void push(T data){

        /* if the stack is full we have to remove the last Node before we can add
        a new Node to the stack */
        if(this.currentSize == maxSize){
            System.out.println("The Stack is full. Removing the last Node.");
            --this.currentSize; // current size counter -1
            Node<T> temp = last;
            if(last.previousNode == null){
                first = null;
            } else {
                last.previousNode.nextNode = null;
            }
            last = last.previousNode;
            System.out.println("The last Node: {" + temp.toString() + "} was removed " +
                    "from the stack.");
        }

        ++this.currentSize;
        Node<T> newNode = new Node<T>(data);

        if(isEmpty()){
            last = newNode;
        } else {
            first.previousNode = newNode;
        }

        newNode.nextNode = first;
        this.first = newNode;
        System.out.println("New Node: {" + newNode.toString() + "} was PUSHED to the Stack.");
    }

    public T pop(){
        if(isEmpty()){
            return null;
        } else {
            --this.currentSize;
            Node<T> temp = first;
            if(first.nextNode == null){
                last = null;
            } else {
                first.nextNode.previousNode = null;
            }

            first = first.nextNode;
            System.out.println("Node: {" + temp.toString() + "} was POPED from the Stack.");
            return temp.getData();
        }
    }

    public T peek(){
        return this.first.getData();
    }

    public boolean isEmpty(){
        return this.first == null;
    }

}
