package AVLTree;

/* Klasa testowa drzew AVL z metodą main.
   Opis działania:
   1. Tworzymy obiekt klasy AvlTree o nazwie avl.
   2. Dodajemy (metoda insert) obiekty od 1 do 32, sprawdzając kontrolnie wydruk drzewa po kilku insertach.
   3. Drukujemy zawartość całego drzewa
   4. Wyświetlamy wysokość drzewa.
   5. Wyświetlamy in order traversal.
 */

public class App {
    public static void main(String[] args) {
        AvlTree avl = new AvlTree();

        avl.insert(1);
        avl.insert(2);
        avl.insert(3);
        avl.insert(4);
        AvlTreePrinter.printNode(avl.getRoot());
        System.out.println();
        avl.insert(5);
        avl.insert(6);
        avl.insert(7);
        avl.insert(8);
        avl.insert(9);
        avl.insert(10);
        AvlTreePrinter.printNode(avl.getRoot());
        System.out.println();
        avl.insert(11);
        avl.insert(12);
        avl.insert(13);
        avl.insert(14);
        avl.insert(15);
        avl.insert(16);
        avl.insert(17);
        avl.insert(18);
        avl.insert(19);
        avl.insert(20);
        AvlTreePrinter.printNode(avl.getRoot());
        System.out.println();
        avl.insert(21);
        avl.insert(22);
        avl.insert(23);
        avl.insert(24);
        avl.insert(25);
        avl.insert(26);
        avl.insert(27);
        avl.insert(28);
        avl.insert(29);
        avl.insert(30);
        avl.insert(31);
        avl.insert(32);

        AvlTreePrinter.printNode(avl.getRoot());
        System.out.println();
        System.out.println("Wysokosc drzewa wynosi: " + avl.findHeight(avl.getRoot()));
        System.out.print("In order traversal: ");
        avl.traverse();
    }
}
