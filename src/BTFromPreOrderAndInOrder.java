/**
 * Created by keepi on 6/24/2017.
 */
public class BTFromPreOrderAndInOrder {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        return buildTree(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
    }

    public TreeNode buildTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd){
        if(preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preOrder[preStart]);
        int rootIndexIN = 0;
        for(int i=0; i<inOrder.length; i++){
            if(inOrder[i] == root.val){
                rootIndexIN = i;
                break;
            }
        }

        root.left   = buildTree(preOrder, preStart+1, preStart+(rootIndexIN-inStart), inOrder, inStart, rootIndexIN-1);
        root.right  = buildTree(preOrder, preStart+(rootIndexIN-inStart)+1, preEnd, inOrder, rootIndexIN+1, inEnd);
        return root;
    }
}
