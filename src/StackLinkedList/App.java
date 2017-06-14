package StackLinkedList;

public class App {
    public static void main(String[] args) {

        StackLinkedList<Integer> myStack = new StackLinkedList<Integer>();

        myStack.push(10);
        myStack.push(100);

        System.out.println(myStack.size());

        System.out.println(myStack.pop());

        System.out.println(myStack.peek());
    }
}
