/**
 * Created by keepi on 6/26/2017.
 */
public class SumOfLeafNodesBT {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public boolean isLeaf(TreeNode node){
        if(node == null)
            return false;
        return node.left == null && node.right == null;
    }

    public int sumOfLeaves(TreeNode root) {
        if(root == null)
            return 0;

        int sum  = 0;
        if(isLeaf(root))
            sum += root.val;
        else{
            sum += sumOfLeaves(root.left);
            sum += sumOfLeaves(root.right);
        }
        return sum;
    }
}
