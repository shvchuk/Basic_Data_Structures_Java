package QueueBuffer;

public class Consumer extends Thread {

    private final Buffer buffer;

    public Consumer (Buffer b){
        this.buffer = b;
    }

    public void run(){
        while(!Thread.currentThread().isInterrupted()){
            int data = buffer.delete();
            System.out.println("Konsument pobrał z kolejki wątek: " + data);
        }
    }
}
