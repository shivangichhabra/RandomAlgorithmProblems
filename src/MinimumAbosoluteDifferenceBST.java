import java.net.Inet4Address;
import java.util.TreeSet;

/**
 * Created by keepi on 6/23/2017.
 */
public class MinimumAbosoluteDifferenceBST {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    int min = Integer.MAX_VALUE;


    /*
    O(n) time
    O(1) space
     */
    TreeNode prev = null;
    public int getMinimumDifferenceBST(TreeNode root) {
        if(root == null)
            return min;

        getMinimumDifferenceBST(root.left);

        if(prev != null)
            min = Math.min(min, root.val - prev.val);

        root = prev;

        getMinimumDifferenceBST(root.right);

        return min;
    }

    /*
    O(nlogn) time
    O(n) space
     */
    TreeSet<Integer> set = new TreeSet<Integer>();
    public int getMinimumDifferenceNotBST(TreeNode root) {
        if(root == null)
            return min;

        if(!set.isEmpty()){
            if(set.floor(root.val) != null)
                min = Math.min(min, root.val - set.floor(root.val));

            if(set.ceiling(root.val) != null)
                min = Math.min(min, set.ceiling(root.val) - root.val);
        }

        set.add(root.val);
        getMinimumDifferenceNotBST(root.left);
        getMinimumDifferenceNotBST(root.right);

        return min;
    }
}
