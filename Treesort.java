import java.util.Scanner;

public class Treesort {

    public static void main(String[] args) {
        DictBinTree dictBinTree = new DictBinTree();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            dictBinTree.insert(scanner.nextInt());
        }

        System.out.println(dictBinTree.orderedTraversal());
    }
}