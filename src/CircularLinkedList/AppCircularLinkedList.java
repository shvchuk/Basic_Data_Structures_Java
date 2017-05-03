package CircularLinkedList;

public class AppCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();

        myList.insertFirst(10);
        myList.insertFirst(20);
        myList.insertFirst(30);
        myList.insertFirst(40);
        myList.insertLast(777777);

        myList.displayList();
        System.out.println("-----------");
        myList.deleteFirst();
        myList.displayList();
    }
}
