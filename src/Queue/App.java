package Queue;
/*  ZADANIE nr 1
    bezpośrednia realizacja kolejki nieograniczonej
    przy użyciu listy jednokierunkowej
    implementacja od zera
 */

public class App {

    public static void main(String[] args) {

        Queue<Integer> kolejka = new Queue<Integer>();

        kolejka.enqueue(10);
        kolejka.enqueue(20);
        kolejka.enqueue(30);
        kolejka.enqueue(40);
        kolejka.enqueue(50);

        System.out.println("*************************");
        kolejka.orderTraversal();
        System.out.println();
        System.out.println("Pierwszy element w kolejce --> " + kolejka.firstNode());
        System.out.println("Ostatni element w kolejce --> " + kolejka.lastNode());
        System.out.println("*************************");

        System.out.println("Usuwamy element z kolejki.");
        kolejka.dequeue();
        kolejka.orderTraversal();
        System.out.println();
        System.out.println("*************************");
        System.out.println("Dodajemy nowy element { 60 } do kolejki.");
        kolejka.enqueue(60);
        kolejka.orderTraversal();
        System.out.println();
        System.out.println("Pierwszy element w kolejce --> " + kolejka.firstNode());
        System.out.println("Ostatni element w kolejce --> " + kolejka.lastNode());
        System.out.println("Rozmiar kolejki: " + kolejka.size());
        System.out.println("*************************");
    }
}
