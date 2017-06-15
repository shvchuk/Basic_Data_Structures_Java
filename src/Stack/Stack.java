package Stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long j){
        if(isFull()){
            System.out.println("Can't add { " + j + " } on the Stack. The Stack if full.");
        } else {
            top++;
            stackArray[top] = j;
            System.out.println("Pushed { " + j + " } on the Stack.");
        }
    }

    public long pop(){
        if(isEmpty()){
            System.out.println("the stack is already empty");
            return -1;
        } else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize - 1 == top);
    }
}
