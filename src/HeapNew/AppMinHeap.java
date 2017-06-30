package HeapNew;

public class AppMinHeap {

    public static void main(String[] args) throws Heap.HeapFullException, Heap.HeapEmptyException {

        MinHeap<Integer> minHeap = new MinHeap<>(Integer.class);

        minHeap.insert(9);
        minHeap.insert(4);
        minHeap.insert(17);
        minHeap.printHeapArray();
        minHeap.insert(6);
        minHeap.printHeapArray();
        minHeap.insert(100);
        minHeap.insert(20);
        minHeap.printHeapArray();
        minHeap.insert(2);
        minHeap.insert(1);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.printHeapArray();

        minHeap.removeHighestPriority();
        minHeap.printHeapArray();
        minHeap.removeHighestPriority();
        minHeap.printHeapArray();
    }
}
