package RedBlackTree;

public class AppTwo {
    public static void main(String[] args) {
        RedBlackTree newTree = new RedBlackTree();

        newTree.insert(1);
        newTree.insert(2);
        newTree.insert(3);
        newTree.insert(4);
        newTree.insert(5);
        newTree.insert(6);
        newTree.insert(7);
        newTree.insert(8);
        newTree.insert(9);
        newTree.insert(10);
        newTree.insert(11);

        RedBlackPrinter.printNode(newTree.getRoot());
        System.out.println();
        System.out.println("Inserting 12");
        newTree.insert(12);
        System.out.println();
        RedBlackPrinter.printNode(newTree.getRoot());

    }
}
