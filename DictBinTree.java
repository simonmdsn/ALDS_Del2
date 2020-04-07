import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

/**
 * Authors: Sofie Louise Madsen (sofma18) Joachim Henrik Bülow (jobul18) Simon
 * Soele Madsen (smads18)
 */

public class DictBinTree implements Dict {

    // This node is our root node in our tree.
    BinNode root;

    // This list represents a list of the keys in our tree.
    ArrayList<Integer> keyList = new ArrayList<>();

    // Our constructor creates an empty dictonary (empty tree).
    public DictBinTree() {
        root = null;
    }

    /*
     * We insert a node in our tree with a key value k, The node will traverse to
     * the right position based of of the children of the nodes. If the k is less
     * than key of the node it will traverse to the left and vice versa.
     */
    @Override
    public void insert(int k) {

        BinNode y = null;
        BinNode x = root;
        while (x != null) {
            y = x;
            if (k < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        if (y == null) {
            root = new BinNode(k);
        } else if (k < y.key) {
            y.left = new BinNode(k);
        } else {
            y.right = new BinNode(k);
        }

    }

    /*
     * Recursion for adding keys to the keyList in order.
     * To avoid returning the global key list for every recursive call we have
     * created a seperate method similar to the psudo code.
     */
    @Override
    public ArrayList<Integer> orderedTraversal() {
        inorderTreeWalk(root);
        return keyList;
    }

    /*
     * If the node is not null it traverses the left subtree 
     * depth-first, and adds the key of node to the keylist 
     * and traverses right subtree, this happens recursively.
     */
    private void inorderTreeWalk(BinNode x) {
        if (x != null) {
            inorderTreeWalk(x.left);
            keyList.add(x.key);
            inorderTreeWalk(x.right);
        }
    }

    /*
     *  Recursive search for finding a node with a key k.
     */
    @Override
    public boolean search(int k) {
        return treeSearch(root, k) == null ? false : true;
    }

    /*
     * The treeSearch begins from the root and traveses the children,
     * recursively. 
     */
    private BinNode treeSearch(BinNode x, int k) {
        if (x == null || k == x.key) {
            return x;
        }
        if (k < x.key) {
            return treeSearch(x.left, k);
        } else {
            return treeSearch(x.right, k);
        }
    }
}