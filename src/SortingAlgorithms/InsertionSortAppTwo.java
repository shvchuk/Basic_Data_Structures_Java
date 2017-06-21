package SortingAlgorithms;

public class InsertionSortAppTwo {

    public static void main(String[] args) {

        //int[] numbers = { 0, 43, 21, 54, -32, 15, 54, 45, 45, 63, 73, 872, 4, 4, 2, 2, 1, 0};

        int[] numbers = new int[10000];


        for(int n = 0; n < 10000; n++){

            numbers[n] = n * (-1);

        }

//        System.out.print("Initial array: ");
//        printArray(numbers);

        insertionSort(numbers);

//        System.out.print("Sorted  array: ");
//        printArray(numbers);
    }

    public static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static int[] insertionSort(int[] numbers){

        int whileLoop = 0;
        int forLoop = 0;

        for(int i = 1; i < numbers.length; i++){

            forLoop++;

            int element = numbers[i];
            int j = i-1;

            while( j >= 0 && numbers[j] > element){
                whileLoop++;
                numbers[j+1] = numbers[j];
                j--;
            }

            numbers[j+1] = element;
        }

        System.out.println("Number of elements in the array: " + numbers.length);
        System.out.println("Number of for loops: " + forLoop);
        System.out.println("Number of while loops: " + whileLoop);
        System.out.println("Complexity: " + (forLoop+whileLoop) / numbers.length + " N");

        return numbers;
    }
}
