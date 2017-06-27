/**
 * Created by keepi on 6/26/2017.
 */
public class SumOfLeftLeaves {

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

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        int sum = 0;
        if(isLeaf(root.left))
            sum += root.left.val;
        else
            sum += sumOfLeftLeaves(root.left);

        sum+= sumOfLeftLeaves(root.right);
        return sum;
    }
}
