package RedBlackTree;

public class RedBlackTree<T extends Comparable<T>> implements Tree<T>{

    public Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    @Override
    public void traverse() {

        if (root != null) {
            inOrderTraversal(root);
        }

    }

    private void inOrderTraversal(Node<T> node) {
        if(node.getLeftChild() != null){
            inOrderTraversal(node.getLeftChild());
        }

        System.out.println(node + " - ");

        if(node.getRightChild() != null){
            inOrderTraversal(node.getRightChild());
        }
    }

    private void rightRotate(Node<T> node){
        System.out.println("Rotating to the right on Node " + node);

        Node<T> tempLeftNode = node.getLeftChild();
        node.setLeftChild(tempLeftNode.getRightChild());

        if( node.getLeftChild() != null ){
            node.getLeftChild().setParent(node);
        }

        tempLeftNode.setParent(node.getParent());

        if(tempLeftNode.getParent() == null){
            root = tempLeftNode;
        } else if( node == node.getParent().getLeftChild()){
            node.getParent().setLeftChild(tempLeftNode);
        } else {
            node.getParent().setRightChild(tempLeftNode);
        }

        tempLeftNode.setRightChild(node);
        node.setParent(tempLeftNode);
    }

    private void leftRotate(Node<T> node){
        System.out.println("Rotating to the left on Node " + node);

        Node<T> tempRightNode = node.getRightChild();
        node.setRightChild(tempRightNode.getLeftChild());

        if( node.getRightChild() != null ){
            node.getRightChild().setParent(node);
        }

        tempRightNode.setParent(node.getParent());

        if(tempRightNode.getParent() == null){
            root = tempRightNode;
        } else if( node == node.getParent().getLeftChild()){
            node.getParent().setLeftChild(tempRightNode);
        } else {
            node.getParent().setRightChild(tempRightNode);
        }

        tempRightNode.setLeftChild(node);
        node.setParent(tempRightNode);
    }

    @Override
    public void insert(T data) {

        Node<T> node = new Node<T>(data);

        root = insertIntoTree(root, node);

        fixViolations(node);
    }

    private void fixViolations(Node<T> node) {

        Node<T> parentNode = null;
        Node<T> grandParentNode = null;

        while( node != root && node.getColor() != NodeColor.BLACK && node.getParent().getColor() == NodeColor.RED ){
            parentNode = node.getParent();
            grandParentNode = node.getParent().getParent();

            if( parentNode == grandParentNode.getLeftChild()){

                Node<T> uncle = grandParentNode.getRightChild();

                if( uncle != null && uncle.getColor() == NodeColor.RED){

                    grandParentNode.setColor(NodeColor.RED);
                    parentNode.setColor(NodeColor.BLACK);
                    uncle.setColor(NodeColor.BLACK);
                    node = grandParentNode;
                } else {

                    if( node == parentNode.getRightChild()){
                        leftRotate(parentNode);
                        node = parentNode;
                        parentNode = node.getParent();
                    }

                    rightRotate(grandParentNode);
                    NodeColor tempColor = parentNode.getColor();
                    parentNode.setColor(grandParentNode.getColor());
                    grandParentNode.setColor(tempColor);
                    node = parentNode;
                }
            } else {

                Node<T> uncle = grandParentNode.getLeftChild();

                if( uncle != null && uncle.getColor() == NodeColor.RED){
                    grandParentNode.setColor(NodeColor.RED);
                    parentNode.setColor(NodeColor.BLACK);
                    uncle.setColor(NodeColor.BLACK);
                    node = grandParentNode;
                } else {

                    if( node == parentNode.getLeftChild()) {
                        rightRotate(parentNode);
                        node = parentNode;
                        parentNode = node.getParent();
                    }

                    leftRotate(grandParentNode);
                    NodeColor tempColor = parentNode.getColor();
                    parentNode.setColor(grandParentNode.getColor());
                    grandParentNode.setColor(tempColor);
                    node = parentNode;
                }
            }
        }

        if(root.getColor() == NodeColor.RED ){
            root.setColor(NodeColor.BLACK);
        }

    }

    private Node<T> insertIntoTree(Node<T> root, Node<T> node) {

        if(root == null) return node;

        if(node.getData().compareTo(root.getData()) < 0) {
            root.setLeftChild( insertIntoTree(root.getLeftChild(), node));
            root.getLeftChild().setParent(root);
        } else if(node.getData().compareTo(root.getData()) > 0){
            root.setRightChild( insertIntoTree(root.getRightChild(), node));
            root.getRightChild().setParent(root);
        }

        return root;
    }
}
