package Graph;

import java.util.ArrayList;

public class Graph {

    private int verticesCount;
    private int edgesCount;

    private ArrayList[] adjacents;

    public Graph(int verticesCount){
        this.verticesCount = verticesCount;
        this.edgesCount = 0;
        adjacents = new ArrayList[verticesCount];

        for(int i = 0; i < verticesCount; i++){
            adjacents[i] = new ArrayList();
        }
    }

    public int getVerticesCount(){
        return verticesCount;
    }

    public int getEdgesCount(){
        return edgesCount;
    }

    public void addEdge(int source, int destination){
        adjacents[source].add(destination);
        edgesCount++;
    }

    /* method adj returns the arraylist of all the edges
    for the particular vertice */
    public Object[] adj(int source){
        return adjacents[source].toArray();
    }
}
