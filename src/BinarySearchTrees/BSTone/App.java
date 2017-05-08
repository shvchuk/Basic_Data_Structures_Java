package BinarySearchTrees.BSTone;

public class App {
    public static void main(String[] args) {

        Tree<Integer> bst = new BinarySearchTree<>();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);

        System.out.println(bst.getMaxValue());
        System.out.println(bst.getMinValue());

        bst.traversal();

        bst.delete(3);
        bst.traversal();

    }
}
