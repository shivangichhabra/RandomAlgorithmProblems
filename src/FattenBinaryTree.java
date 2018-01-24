/**
 * Created by Shivangi on 6/25/2017.
 */
public class FattenBinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    //reversed preorder
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

    public void FlattenBT(TreeNode root){
        if(root == null)
            return;

        TreeNode left = root.left;
        TreeNode right = root.right;

        FlattenBT(left);
        FlattenBT(right);

        root.left = null;
        root.right = left;

        TreeNode prev = root;
        while(prev.right != null)
            prev = prev.right;
        prev.right = right;
    }

}
