package SortingQuickSort;

public class QuickSort {

    private int[] numbers;

    public QuickSort(int[] numbers) {
        this.numbers = numbers;
    }

    public void sort(){
        quicksort(0, numbers.length - 1);
    }

    private void quicksort(int low, int high){

        if( low >= high ) return;

        int pivot = partition(low, high);
        quicksort(low, pivot - 1);
        quicksort(pivot + 1, high);
    }


    private int partition(int low, int high){

        int pivotIndex = (low + high) / 2;
        swap(pivotIndex, high);

        int i = low;

        for(int j = low; j < high; j++){
            if(numbers[j] <= numbers[high]){
                swap(i,j);
                i++;
            }
        }

        swap(i, high);
        return i;

    }

    private void swap(int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public void printArray(){
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }


}
