package GraphAbstract;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjMatrix extends Graph {

    private final int defaultNumVertices = 5;
    private int[][] adjMatrix;

    public GraphAdjMatrix(){
        adjMatrix = new int[defaultNumVertices][defaultNumVertices];
    }

    @Override
    public void implementAddEdge(int v, int w) {
        adjMatrix[v][w] += 1;
    }

    @Override
    public void implementAddVertex() {

        int v = getNumVertices();
        if(v >= adjMatrix.length){
            int[][] newAdjMatrix = new int[v*2][v*2];
            for(int i = 0; i < adjMatrix.length; i++){
                for (int j = 0; j < adjMatrix.length; j++){
                    newAdjMatrix[i][j] = adjMatrix[i][j];
                }
            }

            adjMatrix = newAdjMatrix;
        }
        for(int i = 0; i < adjMatrix[v].length; i++){
            adjMatrix[v][i] = 0;
        }
    }

    @Override
    public List<Integer> getNeighbors(int v) {
        List<Integer> neighbors = new ArrayList<Integer>();
        for(int i = 0; i <getNumVertices(); i++){
            if(adjMatrix[v][i] != 0 ){
                neighbors.add(i);
            }
        }
        return neighbors;
    }

    @Override
    public String toString() {
        return "Graph with: " + getNumVertices() + " vertices and " + getNumEdges() + " edges.";
    }
}