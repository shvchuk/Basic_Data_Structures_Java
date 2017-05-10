package QueueBuffer;

public class AppBuffer {

    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        Producer producent = new Producer(buffer);
        Consumer konsument = new Consumer(buffer);

        producent.start();
        konsument.start();
        try{
            producent.join();
            konsument.interrupt();
        } catch (InterruptedException e){}
    }
}
