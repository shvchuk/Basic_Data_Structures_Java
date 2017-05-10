package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class AppProducerConsumer {

    public static void main(String[] args) {
        // creating blocking queue of size 10
        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        // starting producer to produce messages in queue

        new Thread(producer).start();

        // starting consumer to consume messages in queue

        new Thread(consumer).start();
        System.out.println("Uruchomiono producenta i konsumenta.");
    }
}
