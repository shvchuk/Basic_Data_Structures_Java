package DataHuffman;

public class App {

    public static void main(String[] args) {

        String text = "ABRAKADABRA";

        int[] charFrequencies = new int[256];

        for(char c: text.toCharArray()) ++charFrequencies[c];

        HuffmanCoding code = new HuffmanCoding();
        HuffmanTree huffmanTree = code.buildTree(charFrequencies);
        code.printCodes(huffmanTree, new StringBuilder());
    }
}
