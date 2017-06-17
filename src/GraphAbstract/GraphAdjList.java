package GraphAbstract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphAdjList extends Graph {

    private Map<Integer, ArrayList<Integer>> adjListsMap;

    public GraphAdjList(){
        adjListsMap = new HashMap<Integer, ArrayList<Integer>>();
    }

    @Override
    protected void implementAddEdge(int v, int w) {
        (adjListsMap.get(v)).add(w);
    }

    @Override
    public void implementAddVertex() {
        int v = getNumVertices();
        ArrayList<Integer> neighbors = new ArrayList<Integer>();
        adjListsMap.put(v, neighbors);
    }

    @Override
    public List<Integer> getNeighbors(int v) {
        return new ArrayList<Integer>(adjListsMap.get(v));
    }

    @Override
    public String toString() {
        return "Graph with: " + getNumVertices() + " vertices and " + getNumEdges() + " edges.";
    }
}
