package DoublyLinkedList;

public class AppTwoLists {

    public static void main(String[] args) {

        DoublyLinkedList listaJeden = new DoublyLinkedList();
        DoublyLinkedList listaDwa = new DoublyLinkedList();

        listaDwa.insertFirst(21);
        System.out.println("Przypadek 1: \nLista jeden jest pusta.");
        System.out.print("Lista dwa zaiwera elementy: ");
        listaDwa.displayList();
        System.out.print("Wstawienie listy dwa w określone miejsce listy jeden, daje w wyniku listę: ");
        wstawienieListNumerElementu(listaJeden, listaDwa, 2);
        listaJeden.displayList();

        listaJeden.clearList();
        System.out.println("---------------------");
        listaJeden.insertFirst(11);
        listaJeden.insertFirst(12);
        listaJeden.insertFirst(13);
        System.out.println("Przypadek 2:\nLista jeden zawiera mniej elementów niż indeks przekazany w metodzie.");
        System.out.print("Lista jeden: ");
        listaJeden.displayList();
        System.out.print("Lista dwa: ");
        listaDwa.displayList();
        wstawienieListNumerElementu(listaJeden, listaDwa, 6);
        System.out.println("Wstawienie listy dwa w określone miejsce listy jeden daje w wyniku:");
        listaJeden.displayList();

    }

    public static void wstawienieListNumerElementu(DoublyLinkedList listaJeden, DoublyLinkedList listaDwa,
                                                   int argument){
        if(listaJeden.isEmpty()){
            listaJeden.first = listaDwa.first;
            listaJeden.last = listaDwa.last;
        } else if(argument > listaJeden.sizeOfList){
            listaJeden.last.nextNode = listaDwa.first;
            listaDwa.first.previousNode = listaJeden.last;
            listaJeden.last = listaDwa.last;
        } else {

        }

    }
}
