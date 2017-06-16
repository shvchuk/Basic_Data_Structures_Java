package Graph;

public class App {

    public static void main(String[] args) {

        GraphLinkedList myCitiesDirected = new GraphLinkedList(6, "directed");
        myCitiesDirected.addVertex("Wroclaw");
        myCitiesDirected.addVertex("Katowice");
        myCitiesDirected.addVertex("Krakow");
        myCitiesDirected.addVertex("Warszawa");
        myCitiesDirected.addVertex("Gdansk");
        myCitiesDirected.addVertex("Poznan");

        myCitiesDirected.addEdge("Wroclaw", "Katowice");
        myCitiesDirected.addEdge("Warszawa", "Katowice");
        myCitiesDirected.addEdge("Warszawa", "Krakow");
        myCitiesDirected.addEdge("Warszawa", "Wroclaw");
        myCitiesDirected.addEdge("Warszawa", "Gdansk");
        myCitiesDirected.addEdge("Poznan", "Gdansk");
        myCitiesDirected.addEdge("Wroclaw", "Poznan");

        System.out.println("************ MIASTA GRAF SKIEROWANY ***************");
        myCitiesDirected.print();

        GraphLinkedList myCountriesUndirected = new GraphLinkedList(7, "undirected");
        myCountriesUndirected.addVertex("Polska");
        myCountriesUndirected.addVertex("Niemcy");
        myCountriesUndirected.addVertex("Czechy");
        myCountriesUndirected.addVertex("Slowacja");
        myCountriesUndirected.addVertex("Ukraina");
        myCountriesUndirected.addVertex("Bialorus");
        myCountriesUndirected.addVertex("Rosja");

        myCountriesUndirected.addEdge("Polska", "Niemcy");
        myCountriesUndirected.addEdge("Polska", "Czechy");
        myCountriesUndirected.addEdge("Polska", "Slowacja");
        myCountriesUndirected.addEdge("Polska", "Ukraina");
        myCountriesUndirected.addEdge("Polska", "Bialorus");
        myCountriesUndirected.addEdge("Polska", "Rosja");
        myCountriesUndirected.addEdge("Niemcy", "Czechy");
        myCountriesUndirected.addEdge("Czechy", "Slowacja");
        myCountriesUndirected.addEdge("Slowacja", "Ukraina");
        myCountriesUndirected.addEdge("Ukraina", "Bialorus");
        myCountriesUndirected.addEdge("Bialorus", "Rosja");

        System.out.println("********** PANSTWA GRAF NIESKIEROWANY *************");
        myCountriesUndirected.print();
        System.out.println("***************************************************");



    }
}
