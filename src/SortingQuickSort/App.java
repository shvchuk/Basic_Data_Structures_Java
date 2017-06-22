package SortingQuickSort;

public class App {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 6, 23, -43, 0, 53, -61, 432, 4};

        QuickSort quicksort = new QuickSort(numbers);

        quicksort.printArray();
        quicksort.sort();
        quicksort.printArray();
    }
}
