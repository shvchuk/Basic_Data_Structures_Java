package QueueBuffer;

import java.io.InputStreamReader;

public class Producer extends Thread {

    private final Buffer buffer;

    public Producer(Buffer b){
        this.buffer = b;
    }

    public void run(){

            for(int i = 1; i < 11; i++){

                buffer.insert(i);
                System.out.println("Producent dodał do kolejki wątek: " + i);


            }


        }
    }

