/**
 * Authors:
 *  Sofie Louise Madsen (sofma18)
 *  Joachim Henrik Bülow (jobul18)
 *  Simon Soele Madsen (smads18)
 */

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