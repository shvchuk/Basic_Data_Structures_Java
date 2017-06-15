package StackFixedSize;

public class Node<T extends Comparable<T>> {

    private T data;
    public Node<T> nextNode;
    public Node<T> previousNode;

    public Node(T data) { this.data = data; }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<T> previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
