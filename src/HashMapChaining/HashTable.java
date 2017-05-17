package HashMapChaining;

public class HashTable {

    private HashItem[] hashTable;

    public int get(int key){

        int generatedArrayIndex = hash(key);

        if( hashTable[generatedArrayIndex] == null){
            return -1;
        } else {

            HashItem hashItem = hashTable[generatedArrayIndex];

            while( hashItem != null && hashItem.getKey() != key){
                hashItem = hashItem.getNextHashItem();
            }

            if( hashItem == null ) {
                return -1;
            } else {
                return hashItem.getValue();
            }
        }
    }

    public void put(int key, int value){

        int hashArrayIndex = hash(key);

        if(hashTable[hashArrayIndex] == null){
            hashTable[hashArrayIndex] = new HashItem(key, value);
        } else { // Collision case

            HashItem hashItem = hashTable[hashArrayIndex];

            while(hashItem.getNextHashItem() != null) {
                hashItem = hashItem.getNextHashItem();
            }

            hashItem.setNextHashItem(new HashItem(key, value));
        }
    }

    private int hash(int key){
        return key % Constants.TABLE_SIZE;
    }
}
