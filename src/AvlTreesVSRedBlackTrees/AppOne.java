package AvlTreesVSRedBlackTrees;

import AVLTree.AvlTree;
import RedBlackTree.RedBlackTree;

public class AppOne {
    public static void main(String[] args) {

        AvlTree avlTree = new AvlTree();
        RedBlackTree redBlackTree = new RedBlackTree();

        int numberOfNodes = 0;

        for(int i = 1; i < 10000001; i++){
            avlTree.insert(i);
            redBlackTree.insert(i);
            numberOfNodes++;
        }

        int maxWysokoscRBT = (int) (2*(Math.log(numberOfNodes+1)/Math.log(2)));
        double maxWysokoscAVL = (1.44 * (Math.log(numberOfNodes)/Math.log(2)));

        System.out.println("Liczba wierzcholkow w kazdym drzewie: " + numberOfNodes);
        System.out.println();

        System.out.println("Wysokość drzewa AVL: " + avlTree.findHeight(avlTree.getRoot()));
        System.out.println("Maksymalna dopuszczalna wysokosc drzewa AVL dla " + numberOfNodes + " wierzcholków " +
                "wynosi -> " + maxWysokoscAVL);

        System.out.println();
        System.out.println("Wysokość drzewa Red-Black: " + redBlackTree.findHeight(redBlackTree.getRoot()));
        System.out.println("Maksymalna dopuszczalna wysokosc drzewa RedBlack dla " + numberOfNodes + " wierzcholków " +
                "wynosi -> " + maxWysokoscRBT);
        System.out.println();
    }
}