package SortingMergeSort;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[100];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1000) - 500;
        }

        MergeSort mergeSort = new MergeSort(numbers);
        mergeSort.mergeSort(0, numbers.length - 1);
        mergeSort.printResult();


    }
}
