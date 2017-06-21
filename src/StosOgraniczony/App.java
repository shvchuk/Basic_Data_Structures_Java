package StosOgraniczony;

public class App {

    public static void main(String[] args) {

        StosOgraniczony<Integer> myStack = new StosOgraniczony<Integer>(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        myStack.push(70);

        System.out.println("Current Stack size: " + myStack.size());

        System.out.println("pop " + myStack.pop());
        System.out.println("pop " + myStack.pop());

        System.out.println("Current Stack size: " + myStack.size());

    }
}
