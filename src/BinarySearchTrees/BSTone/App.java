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

        bst.insert(8);
        BTreePrinter.printNode(bst.getRoot());
        bst.delete(3);
        BTreePrinter.printNode(bst.getRoot());

        bst.delete(10);

        BTreePrinter.printNode(bst.getRoot());



    }
}
