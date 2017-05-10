package QueueUrzadKlient;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Klient  implements Runnable{

    private BlockingQueue<Sprawa> queue;
    Random random = new Random();

    public Klient(BlockingQueue<Sprawa> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        for(int i = 1; i < 51; i++){

            Sprawa sprawa = new Sprawa(" "+i);

            try{
                System.out.println("Przyszedł klient:" + sprawa.getSprawa());
                queue.put(sprawa);
                Thread.sleep(random.nextInt(300)+1);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        Sprawa sprawa = new Sprawa("koniec");
        try{
            queue.put(sprawa);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
