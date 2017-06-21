package SortingShellSort;

public class ShellSort {

    private int[] array;

    public ShellSort(int[] array){
        this.array = array;
    }

    public void shellSort(){

        System.out.print("Initial array: ");
        printArray();

        for(int gap = array.length / 2; gap > 0; gap /= 2){

            for (int i = gap; i< array.length; i++){

                int j = i;

                while( j >= gap && array[j - gap] > array [j] ){
                    swap(j, j-gap);
                    j = j-gap;
                }
            }
        }
    }

    private void swap(int j, int i){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public void printArray(){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
