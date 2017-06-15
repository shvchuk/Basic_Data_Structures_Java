package StackArrayResizable;

public class App {
    public static void main(String[] args) {

        StackArray<Integer> myStack = new StackArray<>();

        myStack.push(10);
        myStack.push(100);
        myStack.push(1000);

        System.out.println("");
        System.out.println("Number of items on the Stack: "+ myStack.size());
        System.out.println("The Stack Array length: " + myStack.stackArraysize());
        System.out.println("");

        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        System.out.println("");
        System.out.println("Number of items on the Stack: "+ myStack.size());
        System.out.println("The Stack Array length: " + myStack.stackArraysize());
        System.out.println("");

        System.out.println("Removing the item from the stack: " + myStack.pop());
        System.out.println("Removing the item from the stack: " + myStack.pop());
        System.out.println("Removing the item from the stack: " + myStack.pop());

        System.out.println("");
        System.out.println("Number of items on the Stack: "+ myStack.size());
        System.out.println("The Stack Array length: " + myStack.stackArraysize());
        System.out.println("");

        System.out.println("Removing the item from the stack: " + myStack.pop());
        System.out.println("Removing the item from the stack: " + myStack.pop());
        //System.out.println(myStack.pop());
        //System.out.println(myStack.pop());



    }
}
