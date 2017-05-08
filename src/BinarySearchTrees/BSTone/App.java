package BinarySearchTrees.BSTone;

public class App {
    public static void main(String[] args) {

        Tree<String> bst = new BinarySearchTree<>();

        bst.insert("Adam");
        bst.insert("Joe");
        bst.insert("Michael");
        bst.insert("Kevin");
        bst.insert("Ola");
        bst.insert("Kasia");

        System.out.println(bst.getMaxValue());
        System.out.println(bst.getMinValue());

        bst.traversal();

    }
}
