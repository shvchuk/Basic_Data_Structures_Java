package GraphAbstract;

public class App {

    public static void main(String[] args) {

        System.out.println("******** Graph implemented with Matrix adjacency ******");
        GraphAdjMatrix myMatrix = new GraphAdjMatrix();

        myMatrix.addVertex();
        myMatrix.addVertex();
        myMatrix.addVertex();

        myMatrix.addEdge(0, 1);

        myMatrix.addVertex();
        myMatrix.addVertex();
        myMatrix.addVertex();

        myMatrix.addEdge(1, 2);
        myMatrix.addEdge(1, 3);
        myMatrix.addEdge(2, 4);
        myMatrix.addEdge(2, 5);

        System.out.println(myMatrix.toString());
        System.out.println();
        System.out.println("******** Graph implemented with List adjacency *******");

        GraphAdjList myList = new GraphAdjList();
        myList.addVertex();
        myList.addVertex();
        myList.addVertex();

        myList.addEdge(0, 1);
        myList.addEdge(1, 2);
        myList.addEdge(2, 0);

        System.out.println(myList.toString());

    }



}
