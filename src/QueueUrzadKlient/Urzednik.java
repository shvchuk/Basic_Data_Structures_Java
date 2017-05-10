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

    @Override
    public void run() {

        try{
            Sprawa sprawa;
            while((sprawa = queue.take()).getSprawa() != "koniec"){
                Thread.sleep(random.nextInt(3000)+1);
                System.out.println("Urzędnik " + name + " zaczyna obsługę klienta: "+ sprawa.getSprawa());
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
