package SortingAlgorithms;

public class BogoSortApp {

    public static void main(String[] args) {

        int[] numbers = {12, -4, 56, 0, 3, 8, 2, 1, -10, 98};

        int loopCounter = 0;

        showArray(numbers);
        System.out.println("\nBogo Sort start.");
        while( !isSorted(numbers)){
            ++loopCounter;
            shuffle(numbers);
        }
        System.out.println("Bogo Sort end.");

        System.out.println("Steps to sort an array of " + numbers.length +
                " elements: " + loopCounter);
        showArray(numbers);
    }

    public static void shuffle(int[] numbers){
        for(int i = numbers.length - 1; i >= 0; --i){
            int j = (int) (Math.random() * i);
            swap(numbers, i, j);
        }
    }

    public static void swap(int[] numbers, int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static boolean isSorted(int[] numbers){
        for(int i = 0; i < numbers.length -1; i++){
            if(numbers[i] > numbers[i+1]){
                return false;
            }
        }
        return true;
    }


    public static void showArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
