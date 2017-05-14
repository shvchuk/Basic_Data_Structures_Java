package BinarySearchTrees.BSTone;

import BSTPrinter.BTreePrinter;

public class App {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.traversal();
        System.out.println();

        BTreePrinter.printNode(bst.getRoot());

        bst.delete(5);
        System.out.println();

        BTreePrinter.printNode(bst.getRoot());

        bst.insert(20);
        bst.insert(2);
        bst.insert(22);
        bst.insert(23);
        bst.insert(24);

        System.out.println();

        BTreePrinter.printNode(bst.getRoot());

    }
}
