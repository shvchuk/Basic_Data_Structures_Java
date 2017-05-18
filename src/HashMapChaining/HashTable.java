package HashMapChaining;

public class HashTable {

    private HashItem[] hashTable;

    public HashTable(){
        hashTable = new HashItem[Constants.TABLE_SIZE];
    }

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
            System.out.println("No collision case -> simple insertion into the hash table.");
            hashTable[hashArrayIndex] = new HashItem(key, value);
        } else { // Collision case
            System.out.println("Insertion collision case with key: " + key);
            HashItem hashItem = hashTable[hashArrayIndex];

            while(hashItem.getNextHashItem() != null) {
                hashItem = hashItem.getNextHashItem();
                System.out.println("Considering the next item in linked list: " + hashItem.getValue());
            }

            System.out.println("The place to insert new item in linked list was found.");
            hashItem.setNextHashItem(new HashItem(key, value));
        }
    }

    private int hash(int key){
        return key % Constants.TABLE_SIZE;
    }
}
