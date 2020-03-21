import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

/**
 * Authors:
 *  Sofie Louise Madsen (sofma18)
 *  Joachim Henrik Bülow (jobul18)
 *  Simon Soele Madsen (smads18)
 */

public class DictBinTree implements Dict {

    BinNode root;
    ArrayList<Integer> keyList = new ArrayList<>();

    public DictBinTree(){
        root = null;
    }

    public DictBinTree(BinNode root){
        this.root = root;
    }

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
        }
        else if (k < y.key) {
            y.left = new BinNode(k);
        } else {
            y.right = new BinNode(k);
        }

    }

    @Override
    public ArrayList<Integer> orderedTraversal() {
        // To avoid returning the global key list for every recursive call we have
        // created a seperate method similar to the psudo code.
        inorderTreeWalk(root);
        return keyList;
    }

    @Override
    public boolean search(int k) {
        return treeSearch(root, k) == null ? false : true;
    }

    private void inorderTreeWalk(BinNode x){
        if (x != null){
            inorderTreeWalk(x.left);
            keyList.add(x.key);
            inorderTreeWalk(x.right);
        }
    }

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