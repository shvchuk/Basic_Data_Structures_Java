package SortingShellSort;

public class App {

    public static void main(String[] args) {

        int[] numbers = { 0, 3, 65, 3, 21, 543, -45, 32, -61, -2, 1};

        ShellSort shellSort = new ShellSort(numbers);
        shellSort.shellSort();
        System.out.print("Sorted array: ");
        shellSort.printArray();
    }
}
