/**
 * Authors:
 *  Sofie Louise Madsen (sofma18)
 *  Joachim Henrik Bülow (jobul18)
 *  Simon Soele Madsen (smads18)
 */

//This class represents a node. It has references to its left and right child nodes and its own key.
public class BinNode {

    BinNode left, right;
    int key;

    public BinNode(int key) {
        this.left = null;
        this.right = null;
        this.key = key;
    }

    public BinNode getLeft() {
        return left;
    }

    public BinNode getRight() {
        return right;
    }

    public void setLeft(BinNode l) {
        l = left;
    }

    public void setRight(BinNode r) {
        r = right;
    }

}