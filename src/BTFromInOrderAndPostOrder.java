/**
 * Created by keepi on 6/24/2017.
 */
public class BTFromInOrderAndPostOrder {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public TreeNode buildTree(int[] inOrder, int[] postOrder) {
        return buildTree(inOrder, 0, inOrder.length-1, postOrder, 0, postOrder.length-1);
    }

    public TreeNode buildTree(int[] inOrder, int inStart, int inEnd, int[] postOrder, int postStart, int postEnd) {
        if(inStart > inEnd || postStart > postEnd)
            return null;

        TreeNode root = new TreeNode(postOrder[postEnd]);
        int rootIndexIN = 0;
        for(int i=0; i<inOrder.length; i++){
            if(inOrder[i] == root.val){
                rootIndexIN = i;
                break;
            }
        }


        root.left  = buildTree(inOrder, inStart, rootIndexIN-1, postOrder, postStart, postStart + (rootIndexIN-inStart-1) );
        root.right = buildTree(inOrder, rootIndexIN+1, inEnd, postOrder, postStart + (rootIndexIN - inStart), postEnd-1);
        return root;
    }
}
