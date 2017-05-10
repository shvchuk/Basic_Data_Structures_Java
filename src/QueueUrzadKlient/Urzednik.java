package QueueUrzadKlient;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Urzednik implements Runnable{

    private BlockingQueue<Sprawa> queue;
    private String name;

    public Urzednik(BlockingQueue<Sprawa> queue, String name) {
        this.queue = queue;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Random random = new Random();

    int i = 1;
    @Override
    public void run() {

        try{
            Sprawa sprawa;
            while((sprawa = queue.take()).getSprawa() != "koniec"){
                System.out.println("Urzędnik " + name + " zaczyna obsługę klienta: "+ sprawa.getSprawa());
                Thread.sleep(i);
                i = random.nextInt(2000)+1;
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
