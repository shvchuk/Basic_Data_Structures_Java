package SortingAlgorithms;

public class InsertionSortApp {

    public static void main(String[] args) {

        int[] numbers = {0, 43, -12, 49, -43, 62};

        System.out.print("Initial array: ");
        showArray(numbers);
        for(int i = 1; i < numbers.length; i++){

            int j = i;

            while( (j>0) && (numbers[j-1] > numbers[j])){
                swap(numbers, j, j-1);
                --j;
            }
        }

        System.out.print("Sorted array: ");
        showArray(numbers);

    }

    public static void showArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] numbers, int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
