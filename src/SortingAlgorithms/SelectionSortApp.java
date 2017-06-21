package SortingAlgorithms;

public class SelectionSortApp {

    public static void main(String[] args) {

        int[] numbers = {4, 56, 32, -65, 23, -90};

        System.out.print("Initial array: ");
        showArray(numbers);

        for(int i = 0; i < numbers.length - 1; i++){

            int index = i;

            for(int j = i+1; j < numbers.length; j++){
                if(numbers[j] < numbers[index]){
                    index = j;
                }
            }

            if(index != i){
                int temp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = temp;
            }
        }

        System.out.print("Sorted  array: ");
        showArray(numbers);
    }

    public static void showArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
