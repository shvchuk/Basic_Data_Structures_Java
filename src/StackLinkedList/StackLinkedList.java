package StackLinkedList;

public class StackLinkedList<T extends Comparable<T>> {

    private Node<T> root; // reference to the root of the stack
    private int count; // tracking the size of the stack

    public void push(T newData){

        this.count++;

        if(this.root == null){
            this.root = new Node<T>(newData);
        } else {

            Node<T> oldRoot = this.root;
            this.root = new Node<T>(newData);
            this.root.setNextNode(oldRoot);
        }
    }

    public T pop(){

        T itemToPop = this.root.getData();
        this.root = this.root.getNextNode();
        this.count--;
        return itemToPop;
    }

    public T peek(){
        return this.root.getData();
    }

    public int size(){
        return this.count;
    }

    public boolean isEmpty(){
        return this.root == null;
    }
}
