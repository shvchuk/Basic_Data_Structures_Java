package HashOne;

import java.util.Arrays;

public class HashFunction {

    String[] theArray;
    int arraySize;
    int itemsInArray = 0;

    public static void main(String[] args) {

        HashFunction theFunc = new HashFunction(30);

        //String[] elementsToAdd = {"1", "5", "17", "21", "26"};

        //theFunc.hashFunction1(elementsToAdd, theFunc.theArray);

        String[] elementsToAdd2 = {"100", "23", "24", "53", "233", "223", "223", "323", "423", "43", "26", "54", "65", "56", "534", "342", "34", "55", "532",
                "243", "562", "735"};
        // "1332", "634", "14", "224", "564", "6454", "2634", "43352"};

        theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);

        theFunc.displayTheStack();

    }

    private void displayTheStack() {

        int increment = 0;
        for(int m = 0; m < 3; m++){
            increment+=10;
            for(int n = 0; n < 71; n++){
                System.out.print("-");
            }
            System.out.println();

            for(int n = increment - 10; n < increment; n++){
                System.out.format("| %3s " + " ", n);
            }

            System.out.println("|");

            for(int n = 0; n < 71; n++){
                System.out.print("-");
            }
            System.out.println();

            for(int n = increment - 10; n < increment; n++){
                if(theArray[n].equals("-1")) System.out.print("|      ");
                else System.out.print(String.format("| %3s " + " ", theArray[n]));
            }

            System.out.println("|");
        }
        for(int n = 0; n < 71; n++) System.out.print("-");
    }

    public void hashFunction1(String[] stringsForArray, String[] theArray){

        for(int n = 0; n < stringsForArray.length; n++){

            String newElementVal = stringsForArray[n];

            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }
    }

    public void hashFunction2(String[] stringsForArray, String[] theArray){

        for(int n = 0; n < stringsForArray.length; n++){

            String newElementVal = stringsForArray[n];

            int arrayIndex = Integer.parseInt(newElementVal) % 29;

            System.out.println("Modulus index = " + arrayIndex + " for value " + newElementVal);

            while(theArray[arrayIndex] != "-1"){

                ++arrayIndex;

                System.out.println("Collision Try "+ arrayIndex + " Instead");

                arrayIndex %= arraySize;
            }

            theArray[arrayIndex] = newElementVal;
        }
    }

    HashFunction(int size) {

        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");

    }

}























