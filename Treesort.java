import java.util.Scanner;

/**
 * Authors:
 *  Sofie Louise Madsen (sofma18)
 *  Joachim Henrik Bülow (jobul18)
 *  Simon Soele Madsen (smads18)
 */

 /*
  * User has the opportunity to insert keys in the tree.
  * In the end it prints the tree in order. 
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