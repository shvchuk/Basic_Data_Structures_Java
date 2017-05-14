package RedBlackTree;

public class App {

    public static void main(String[] args) {

        RedBlackTree redBlackTree = new RedBlackTree();

        redBlackTree.insert(10);
        redBlackTree.insert(5);
        redBlackTree.insert(6);

        RedBlackPrinter.printNode(redBlackTree.getRoot());

        redBlackTree.insert(35);
        redBlackTree.insert(40);
        redBlackTree.insert(45);
        redBlackTree.insert(50);
        System.out.println();

        RedBlackPrinter.printNode(redBlackTree.getRoot());

        redBlackTree.insert(19);
        redBlackTree.insert(18);
        redBlackTree.insert(17);

        System.out.println();

        RedBlackPrinter.printNode(redBlackTree.getRoot());
    }
}
