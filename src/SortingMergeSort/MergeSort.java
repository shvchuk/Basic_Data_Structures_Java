package SortingMergeSort;

public class MergeSort {

    private int[] numbers;
    private int[] tempArray;

    public MergeSort(int[] numbers) {
        this.numbers = numbers;
        tempArray = new int[numbers.length];
    }

    public void mergeSort(int low, int high){

        if(low >= high){
            return;
        }

        int middle = (low + high) / 2;

        mergeSort(low, middle);
        mergeSort(middle + 1, high);
        merge(low, middle, high);
    }

    public void printResult(){
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private void merge(int low, int middle, int high){

        for(int i = low; i <= high; i++){
            tempArray[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while ( i <= middle && j <= high){
            if(tempArray[i] <= tempArray[j]){
                numbers[k] = tempArray[i];
                i++;
            } else {
                numbers[k] = tempArray[j];
                j++;
            }
            k++;
        }
        /* case where the left has some items left
           we have to copy the remaining items from the left array to tempArray
        */
        while (i <= middle){
            numbers[k] = tempArray[i];
            k++;
            i++;
        }
        /* case the right array has some items left
        have to copy remaining items from the right array to tempArray
         */
        while (j <= high){
            numbers[k] = tempArray[j];
            k++;
            j++;
        }
    }

    public boolean isSorted(){
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > numbers[i+1]){
                return false;
            }
        }

        return true;
    }


}
