package Stack;

public class App {
    public static void main(String[] args) {

        Stack theStack = new Stack(5);

        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        theStack.push(60);
        theStack.push(70);

        System.out.println("");
        System.out.println("Taking all the items from the Stack using pop() method.");
        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.println(value);
        }
    }

}
