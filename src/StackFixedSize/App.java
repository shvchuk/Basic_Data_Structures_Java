package StackFixedSize;

public class App {

    public static void main(String[] args) {

        StackFixedSize<Integer> myStack = new StackFixedSize<Integer>(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        System.out.println("");

        myStack.push(60);

        System.out.println("");

        myStack.push(70);

        System.out.println("");

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
    }
}
