package CircularQueue;

public class Queue {
    private int queueMaxSize;
    private int frontPointer = 0;
    private int rearPointer = 0;
    private int queueSize = 0;
    private char[] queue;

    public Queue(int size){
        queueMaxSize = size;
        frontPointer = 0;
        rearPointer = 0;
        queueSize = 0;
        queue = new char[queueMaxSize];
    }

    public char delete(){
        if(!emptyQueue()){
            queueSize--;
            frontPointer = (frontPointer + 1) % queueMaxSize;
            return queue[frontPointer];
        } else {
            System.err.println("Underflow");
            return '?';
        }
    }

    public void insert(char c){
        if(!fullQueue()){
            queueSize++;
            rearPointer = (rearPointer + 1) % queueMaxSize;
            queue[rearPointer] = c;
        } else {
            System.err.println("Overflow\n");
        }
    }

    public boolean emptyQueue(){
        return queueSize == 0;
    }

    public boolean fullQueue(){
        return queueSize == queueMaxSize;
    }

    public void printQueue(){
        System.out.print("Size: " + queueSize + ", rearPointer: " + rearPointer +
        ", frontPointer: " + frontPointer + ", queue: ");
        for(int i = 0; i < queueMaxSize; i++){
            System.out.print("queue[" + i + "] = " + queue[i]+ "; ");
        }
        System.out.println();
    }
}
