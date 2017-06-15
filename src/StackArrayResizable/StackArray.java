package StackArrayResizable;

public class StackArray<T> {

    private T[] stack;
    private int numOfItems;

    public StackArray(){
        this.stack = ( T[] ) new Object[1];
    }

    public void push(T newData){

        if (numOfItems == (3 * this.stack.length) / 4){
            System.out.println("Resizing X 2 the Stack Array.");
            resize(2*this.stack.length);
        }

        this.stack[numOfItems++] = newData;
        System.out.println("New item PUSHED on the stack: "+ newData.toString());
    }

    public T pop(){

        T itemToPop = this.stack[--numOfItems];

        if (numOfItems > 0 && numOfItems == this.stack.length / 4){
            System.out.println("Resizing / 2 the Stack Array.");
            resize(this.stack.length / 2);
        }

        return itemToPop;
    }

    public boolean isEmpty(){
        return this.numOfItems == 0;
    }

    public int size(){
        return numOfItems;
    }

    public int stackArraysize(){ return this.stack.length; }

    private void resize(int capacity){

        T[] stackCopy = (T[]) new Object[capacity];

        for(int i = 0; i < numOfItems; i++){
            stackCopy[i] = this.stack[i];
        }

        this.stack = stackCopy;
    }
}
