package QueueNew;

public class Queue {

    private int maxSize; // init the set number of slots
    private long[] queArray; // slots to maintain the data
    private int front; // the index position for the element in the front
    private int rear; // index position for the element at the back of the line
    private int numberOfItems;

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; // index pos of the first slot of the array
        rear = -1; // there is no item in the array to be considered as the last item
        numberOfItems = 0; // we dont have elements in the array yet
    }

    // putting items into the end of the queue
    public void insert(long data){

        if(isFull()){
            System.out.println("Queue is full.");
            return;
        }
        rear++;
        queArray[rear] = data;
        numberOfItems++;
    }

    public long remove(){ // remove item from the front of the queue
        long temp = queArray[front];
        front++;
        if(front == maxSize){
            front = 0; // we can set front back to the 0th index so that we can utilize the entire array
        }
        numberOfItems--;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (numberOfItems == 0);
    }

    public boolean isFull(){
        return (numberOfItems == maxSize);
    }

    public void display(){
        System.out.print("[ ");
        for(int i = 0; i <queArray.length; i++){
            System.out.print(queArray[i]+ " ");
        }
        System.out.print("]");
    }
}
