package HashMapLinearProbing;

public class HashTable {

    private HashItem[] hashTable;

    public HashTable(){
        this.hashTable = new HashItem[Constants.TABLE_SIZE];
    }

    public int get(int key){

        int generatedIndex = hashFunction(key);

        while( hashTable[generatedIndex] != null && hashTable[generatedIndex].getKey() == key){
            generatedIndex = (generatedIndex + 1) % Constants.TABLE_SIZE;
            System.out.println("Looking for the next index: " + generatedIndex);
        }

        if( hashTable[generatedIndex] == null){
            return -1;
        } else {
            return hashTable[generatedIndex].getValue();
        }
    }


    public void put(int key, int value){

        int generatedIndex = hashFunction(key);
        System.out.println("Put method called with value: " + value +"; generated index = " + generatedIndex);
        while( hashTable[generatedIndex] != null ){
            generatedIndex = (generatedIndex + 1) % Constants.TABLE_SIZE;
            System.out.println("Collision, new index generated = " + generatedIndex);
        }

        hashTable[generatedIndex] = new HashItem(key, value);
        System.out.println("Inserted finally with generated index: " + generatedIndex);
    }

    private int hashFunction(int key) {
        //return key % Constants.TABLE_SIZE;
        return 0;
    }
}
