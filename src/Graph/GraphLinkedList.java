package Graph;

public class GraphLinkedList {

    Vertex[] arrayOfLists;
    int indexCounter = 0;
    boolean undirected = true;

    class Node {
        public int vertexIdx;
        public Node next;
        public Node(int vertexIdx, Node node){
            this.vertexIdx = vertexIdx;
            next = node;
        }
    }

    class Vertex{
        String name;
        Node adjList;
        Vertex(String name, Node aNode){
            this.name = name;
            this.adjList = aNode;
        }
    }

    public GraphLinkedList(int verticesCounter, String graphType){

        if(graphType.equals("directed")){
            undirected = false;
        }

        arrayOfLists = new Vertex[verticesCounter];
    }

    public void addVertex(String vertexName){
        arrayOfLists[indexCounter] = new Vertex(vertexName, null);
        indexCounter++;
    }

    public void addEdge(String sourceVertexName, String destinationVertexName){
        int v1Idx = indexForName(sourceVertexName);
        int v2Idx = indexForName(destinationVertexName);
        arrayOfLists[v1Idx].adjList = new Node(v2Idx, arrayOfLists[v1Idx].adjList);
        if(undirected){
            arrayOfLists[v2Idx].adjList = new Node(v1Idx, arrayOfLists[v2Idx].adjList);
        }
    }

    int indexForName(String name){
        for (int i = 0; i < arrayOfLists.length; i++){
            if(arrayOfLists[i].name.equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        System.out.println();
        for(int i = 0; i < arrayOfLists.length; i++){
            System.out.println(arrayOfLists[i].name);
            for(Node aNode = arrayOfLists[i].adjList; aNode != null; aNode = aNode.next){
                System.out.println(" --> " + arrayOfLists[aNode.vertexIdx].name);
            }
            System.out.println("\n");
        }
    }
}























