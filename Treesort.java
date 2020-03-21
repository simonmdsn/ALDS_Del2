import java.util.Scanner;

/**
 * Authors:
 *  Sofie Louise Madsen (sofma18)
 *  Joachim Henrik Bülow (jobul18)
 *  Simon Soele Madsen (smads18)
 */

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