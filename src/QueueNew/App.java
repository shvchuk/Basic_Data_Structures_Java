package QueueNew;

public class App {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);

        myQueue.insert(100);
        myQueue.insert(105);
        myQueue.insert(15);
        myQueue.insert(27);
        myQueue.insert(358);
        myQueue.insert(400);

        myQueue.display();
        System.out.println();
        System.out.println("Removing the item from the queue.");
        myQueue.remove();
        System.out.println();
        myQueue.display();
        myQueue.remove();
        myQueue.remove();
        myQueue.display();
    }
}
