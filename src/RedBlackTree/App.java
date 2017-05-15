package RedBlackTree;

public class App {

    public static void main(String[] args) {

        RedBlackTree redBlackTree = new RedBlackTree();

        redBlackTree.insert(50);
        redBlackTree.insert(45);
        redBlackTree.insert(60);
        redBlackTree.insert(30);
        redBlackTree.insert(47);
        redBlackTree.insert(55);
        redBlackTree.insert(80);
        redBlackTree.insert(20);
        redBlackTree.insert(43);
        redBlackTree.insert(46);
        redBlackTree.insert(48);

        RedBlackPrinter.printNode(redBlackTree.getRoot());
        System.out.println();


        System.out.println("**************************************");
        System.out.println();
        System.out.println("Inserting node 35");
        System.out.println();
        redBlackTree.insert(35);
        System.out.println();
        RedBlackPrinter.printNode(redBlackTree.getRoot());
        System.out.println();
        System.out.println("Wysokosc drzewa wynosi: " + redBlackTree.findHeight(redBlackTree.getRoot()));


        System.out.println("***************************************");
        System.out.println();
        System.out.println("Inserting node 52");
        System.out.println();
        redBlackTree.insert(52);
        RedBlackPrinter.printNode(redBlackTree.getRoot());
        System.out.println();



        redBlackTree.insert(51);

        RedBlackPrinter.printNode(redBlackTree.getRoot());

//        redBlackTree.insert(8);
//        System.out.println();
//

//
//        redBlackTree.insert(19);
//        redBlackTree.insert(18);
//        redBlackTree.insert(17);
//
//        System.out.println();
//
//        RedBlackPrinter.printNode(redBlackTree.getRoot());
    }
}
