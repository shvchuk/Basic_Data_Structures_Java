package SortingAlgorithms;

public class BubbleSortApp {

    public static void main(String[] args) {

        int[] numbers = {43, 14, -54, 62, 1, -12};

        showArray(numbers);

        for(int i = 0; i < numbers.length - 1; i++){
            for (int j=0; j < numbers.length - 1 - i; j++){
                if(numbers[j] > numbers[j+1]){
                    swap(numbers, j, j+1);
                }
            }
        }

        showArray(numbers);
    }

    private static void swap(int[] numbers, int j, int i){
        int temp = numbers[j];
        numbers[j] = numbers[i];
        numbers[i] = temp;
    }

    private static void showArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
