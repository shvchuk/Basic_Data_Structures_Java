package QueueBuffer;

public class Buffer {

    private int maxBuffSize;
    private int[] buffer;
    private int bufferStart;
    private int bufferEnd;
    private int bufferSize;

    public Buffer(int size){
        this.maxBuffSize = size;
        bufferEnd = -1;
        bufferStart = 0;
        bufferSize = 0;
        buffer = new int[this.maxBuffSize];
    }

    public synchronized void insert(int data){
        try{
            while(bufferSize == maxBuffSize){

                wait();
            }
            bufferEnd = (bufferEnd + 1) % maxBuffSize;
            buffer[bufferEnd] = data;
            bufferSize++;
            notifyAll();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public synchronized int delete(){
        try{
            while(bufferSize == 0){
                wait();
            }

            int dataOut = buffer[bufferStart];
            bufferStart = (bufferStart + 1) % maxBuffSize;
            bufferSize--;
            notifyAll();
            return dataOut;
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
            return 'i';
        }
    }
}
