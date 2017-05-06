package DoublyLinkedList;

public class AppTwoLists {

    public static void main(String[] args) {

        DoublyLinkedList listaJeden = new DoublyLinkedList();
        DoublyLinkedList listaDwa = new DoublyLinkedList();

        listaDwa.insertFirst(21);
        listaDwa.insertFirst(22);
        listaDwa.insertFirst(23);
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

        listaJeden.clearList();
        System.out.println("---------------------");
        listaJeden.insertFirst(11);
        listaJeden.insertFirst(12);
        listaJeden.insertFirst(13);
        System.out.println("Przypadek 3:\nArgument = 1, czyli wstawiamy listę dwa na sam początek listy jeden.");
        System.out.print("Lista jeden: ");
        listaJeden.displayList();
        System.out.print("Lista dwa: ");
        listaDwa.displayList();
        wstawienieListNumerElementu(listaJeden, listaDwa, 1);
        System.out.println("Wstawienie listy dwa przed pierwszy element listy jeden daje:");
        listaJeden.displayList();

        listaJeden.clearList();
        listaDwa.clearList();
        System.out.println("---------------------");
        listaJeden.insertFirst(11);
        listaJeden.insertFirst(12);
        listaJeden.insertFirst(13);
        listaJeden.insertFirst(14);
        listaDwa.insertFirst(21);
        listaDwa.insertFirst(22);
        listaDwa.insertFirst(23);
        System.out.println("Przypadek 4:\nWstawiamy listę dwa w środek listy jeden.");
        System.out.print("Lista jeden: ");
        listaJeden.displayList();
        System.out.print("Lista dwa: ");
        listaDwa.displayList();
        wstawienieListNumerElementu(listaJeden, listaDwa, 3);
        listaJeden.displayList();

        System.out.println("--------------------");
        System.out.println("Metoda wstawienie listy w określone miejsce listy jeden zgodnie z wartością " +
                "elementu listy jeden, przed który należy wstawić listę dwa.");
        DoublyLinkedList listaPierwsza = new DoublyLinkedList();
        DoublyLinkedList listaDruga = new DoublyLinkedList();
        listaPierwsza.insertFirst(11);
        listaPierwsza.insertFirst(12);
        listaPierwsza.insertFirst(13);
        listaDruga.insertFirst(20);
        listaDruga.insertFirst(21);
        listaDruga.insertFirst(22);

        System.out.println("Lista pierwsza: ");
        listaPierwsza.displayList();
        System.out.println("Lista druga: ");
        listaDruga.displayList();
        wstawienieListyWartoscElementu(listaPierwsza, listaDruga, 11);
        System.out.print("Lista pierwsza po wstawieniu: ");
        listaPierwsza.displayList();

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
        } else if(argument == 1){
            listaDwa.last.nextNode = listaJeden.first;
            listaJeden.first.previousNode = listaDwa.last;
            listaJeden.first = listaDwa.first;
        } else {
            Node current = listaJeden.first;
            for(int i = 1; i < argument; i++) {
                current = current.nextNode;
            }
                current.previousNode.nextNode = listaDwa.first;
                listaDwa.first.previousNode = current.previousNode;
                listaDwa.last.nextNode = current;
                current.previousNode = listaDwa.last;
            }
    }

    public static void wstawienieListyWartoscElementu(DoublyLinkedList listaJeden, DoublyLinkedList listaDwa, int data){
        Node current = listaJeden.first;
        while(!current.getData().equals(data)){
            current = current.nextNode;
        }
        current.previousNode.nextNode = listaDwa.first;
        listaDwa.first.previousNode = current.previousNode;
        listaDwa.last.nextNode = current;
        current.previousNode = listaDwa.last;
    }

}

