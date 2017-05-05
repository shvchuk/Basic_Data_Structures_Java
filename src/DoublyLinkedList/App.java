package DoublyLinkedList;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList lista = new DoublyLinkedList();

        lista.insertFirst(10);
        lista.insertFirst(20);
        lista.insertFirst(30);

        lista.displayList();

        lista.insertFirst(40);

        lista.displayList();

        lista.insertAfter(30, 25);

        lista.displayList();

        lista.insertLast(5);

        lista.displayList();

        lista.deleteData(25);

        lista.displayList();
    }
}
