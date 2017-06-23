package Heap;

public class App {

    public static void main(String[] args) {

        Heap heap = new Heap(10);

        heap.insert(65);
        heap.insert(3);
        heap.insert(8);
        heap.insert(12);
        heap.insert(6);
        heap.insert(18);
        heap.insert(23);
        heap.insert(9);
        heap.insert(2);

        heap.heapsort();
    }
}
