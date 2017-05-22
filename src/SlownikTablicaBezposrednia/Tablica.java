package SlownikTablicaBezposrednia;

public class Tablica {

    private Item[] tablicaBezposrednia;
    private int rozmiarTablicy;

    public Tablica(Item[] tablicaBezposrednia, int rozmiarTablicy) {
        tablicaBezposrednia = new Item[rozmiarTablicy];
        this.rozmiarTablicy = rozmiarTablicy;
    }
}
