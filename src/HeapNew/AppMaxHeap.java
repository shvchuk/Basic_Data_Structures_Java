package HeapNew;

public class AppMaxHeap {

    public static void main(String[] args) throws Heap.HeapFullException, Heap.HeapEmptyException{

        MaxHeap<Integer> maxHeap = new MaxHeap<>(Integer.class);

        maxHeap.insert(9);
        maxHeap.insert(4);
        maxHeap.insert(17);
        maxHeap.printHeapArray();
        maxHeap.insert(6);
        maxHeap.insert(100);
        maxHeap.insert(20);
        maxHeap.insert(2);
        maxHeap.insert(1);
        maxHeap.printHeapArray();

        maxHeap.removeHighestPriority();
        maxHeap.printHeapArray();
        maxHeap.removeHighestPriority();
        maxHeap.printHeapArray();

    }
}
