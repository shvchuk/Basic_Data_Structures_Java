package GraphAbstract;

import java.util.List;

public abstract class Graph {

    private int numVertices;
    private int numEdges;

    public Graph(){
        numVertices = 0;
        numEdges = 0;
    }

    public int getNumVertices(){
        return numVertices;
    }

    public int getNumEdges(){
        return numEdges;
    }

    public void addVertex(){
        implementAddVertex();
        System.out.println("Vertex: " + numVertices + " added.");
        numVertices++;
    }

    public abstract void implementAddVertex();
    
    public void addEdge(int v, int w){
        numEdges++;
        if(v < numVertices && w < numVertices){
            implementAddEdge(v, w);
        } else {
            throw new IndexOutOfBoundsException();
        }
        System.out.println("New edge added from vertex: { "+ v + " } to vertex: { " + w + " }.");
    }

    protected abstract void implementAddEdge(int v, int w);

    public abstract List<Integer> getNeighbors(int v);


}
