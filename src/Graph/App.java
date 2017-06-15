package Graph;

public class App {

    public static void main(String[] args) {

        Graph myGraph = new Graph(5);
        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 3);
        myGraph.addEdge(2, 1);
        myGraph.addEdge(2, 3);
        myGraph.addEdge(3, 0);
        myGraph.addEdge(3, 2);
        myGraph.addEdge(3, 4);
        myGraph.addEdge(4, 2);

        Object [] values = myGraph.adj(0);
        for(Object val: values){
            System.out.println(val);
        }
    }
}
