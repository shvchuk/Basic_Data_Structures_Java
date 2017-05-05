package DoublyLinkedList;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList lista = new DoublyLinkedList();

        lista.insertFirst(10);
        lista.insertFirst(20);
        lista.insertFirst(30);

        lista.displayList();
        System.out.println("Rozmiar listy: " + lista.sizeOfList);

        lista.insertFirst(40);

        lista.displayList();
        System.out.println("Rozmiar listy: " + lista.sizeOfList);

        lista.insertAfter(30, 25);

        lista.displayList();
        System.out.println("Rozmiar listy: " + lista.sizeOfList);

        lista.insertLast(5);

        lista.displayList();
        System.out.println("Rozmiar listy: " + lista.sizeOfList);

        lista.deleteData(25);

        lista.displayList();
        System.out.println("Rozmiar listy: " + lista.sizeOfList);

        lista.deleteFirst();
        lista.displayList();
        System.out.println("Rozmiar listy: " + lista.sizeOfList);

        lista.deleteLast();
        lista.displayList();
        System.out.println("Rozmiar listy: " + lista.sizeOfList);
    }
}
