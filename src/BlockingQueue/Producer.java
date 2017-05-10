package BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        // producing messages
        for(int i = 1; i < 21; i++){
            Message msg = new Message(" proces " + i);
            try{
                Thread.sleep(i);
                queue.put(msg);
                System.out.println("Producent utworzył" + msg.getMessage());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        // adding exit message
        Message msg = new Message("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
