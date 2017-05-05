package DoublyLinkedList;

public class DoublyLinkedList<T extends Comparable<T>> {
    public Node<T> first;
    public Node<T> last;
    public int sizeOfList;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(T data){

        ++this.sizeOfList;

        Node<T> newNode = new Node<T>(data);

        if(isEmpty()){
            last = newNode;
        } else {
            first.previousNode = newNode;
        }

        newNode.nextNode = first;
        this.first = newNode;
    }

    public void insertLast(T data){

        ++this.sizeOfList;

        Node<T> newNode = new Node<T>(data);

        if(isEmpty()){
            first = newNode;
        } else {
            last.nextNode = newNode;
            newNode.previousNode = last;
        }
        this.last = newNode;
    }

    public Node<T> deleteFirst(){
        if(isEmpty()){
            return null;
        } else {
            --this.sizeOfList;
            Node<T> temp = first;
            if(first.nextNode == null){
                last = null;
            } else {
                first.nextNode.previousNode = null;
            }

            first = first.nextNode;
            return temp;
        }
    }

    public Node<T> deleteLast(){
        if(isEmpty()){
            return null;
        } else {
            --this.sizeOfList;
            Node<T> temp = last;
            if(last.previousNode == null){
                first = null;
            } else {
                last.previousNode.nextNode = null;
            }

            last = last.previousNode;
            return temp;
        }
    }

    public boolean insertAfter(T data, T newData){
        if(isEmpty()) {
            return false;
        } else {
            ++this.sizeOfList;
            Node<T> current = first;
            while(current.getData() != data){
                current = current.nextNode;
                if(current == null){
                    return false;
                }
            }

            Node<T> newNode = new Node<T>(newData);
            if(current == last){
                current.nextNode = null; // ?? sprawdzić dokładnie działanie
                last = newNode;
            } else {
                newNode.nextNode = current.nextNode;
                current.nextNode.previousNode = newNode;
            }

            newNode.previousNode = current;
            current.nextNode = newNode;
            return true;
        }
    }

    public Node<T> deleteData(T data){
        if(isEmpty()) {
            return null;
        } else {
            --this.sizeOfList;
            Node<T> current = first;
            while(current.getData() != data){
                current = current.nextNode;
                if(current == null){
                    return null;
                }
            }

            if(current == first){
                first = current.nextNode;
                current.nextNode.previousNode = null; // ?? czy zadziała?
            } else {
                current.previousNode.nextNode = current.nextNode;
            }

            if(current == last){
                last = current.previousNode;
            } else {
                current.nextNode.previousNode = current.previousNode;
            }

            return  current;
        }
    }

    public void clearList(){
        this.first = null;
        this.last = null;
    }

    public void displayList(){
        System.out.print("List (first --> last): ");
        Node<T> current = first;
        while(current != null){
            current.displayNode();
            current = current.nextNode;
        }
        System.out.println();
    }

    public int size(){
        return sizeOfList;
    }
}
