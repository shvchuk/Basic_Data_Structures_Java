package GraphAbstract;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public void bfs(int source){

        System.out.println("BFS traversal of the graph starting at vertex: " + source);

        Queue<Integer> queue = new LinkedList<Integer>();

        int vertices = getNumVertices();
        int[] visited = new int[vertices];
        int i, element;

        visited[source] = 1;
        queue.add(source);

        while(!queue.isEmpty()){
            element = queue.remove();
            i = element;
            System.out.print(i + "\t");
            while(i <= vertices){
                if(adjMatrix[element][i] == 1 && visited[i] == 0){
                    queue.add(i);
                    visited[i] = 1;
                }
                i++;
            }
        }
    }
}

























