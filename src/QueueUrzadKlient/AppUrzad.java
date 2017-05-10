package QueueUrzadKlient;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class AppUrzad {

    public static void main(String[] args) {
        BlockingQueue<Sprawa> queue = new ArrayBlockingQueue<>(10);
        Klient klient = new Klient(queue);
        Urzednik urzednikA = new Urzednik(queue, "A");
        Urzednik urzednikB = new Urzednik(queue, "B");
        Urzednik urzednikC = new Urzednik(queue, "C");

        new Thread(klient).start();
        new Thread(urzednikA).start();
        new Thread(urzednikB).start();
        new Thread(urzednikC).start();

    }
}
