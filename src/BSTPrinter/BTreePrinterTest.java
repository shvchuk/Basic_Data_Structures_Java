package BSTPrinter;

import BinarySearchTrees.BSTone.BinarySearchTree;

public class BTreePrinterTest {

    public static void main(String[] args) {

        BinarySearchTree bstTree = new BinarySearchTree();

        bstTree.insert(10);
        bstTree.insert(5);
        bstTree.insert(7);
        bstTree.insert(4);
        bstTree.insert(18);
        bstTree.insert(15);
        bstTree.insert(22);

        BTreePrinter.printNode(bstTree.getRoot());

    }
}
