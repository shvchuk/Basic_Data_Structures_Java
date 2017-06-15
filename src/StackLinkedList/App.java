package StackLinkedList;

public class App {
    public static void main(String[] args) {

        StackLinkedList<Integer> myStack = new StackLinkedList<Integer>();

        myStack.push(10);
        myStack.push(200);
        myStack.push(300);
        myStack.push(400);

        System.out.println(myStack.size());

        System.out.println("pop: " + myStack.pop());

        System.out.println("peek: " + myStack.peek());
    }
}
