/**
 * Created by Shivangi on 6/15/2017.
 */
public class CheckBTforBST {
    class Node{
        Node left;
        Node right;
        int data;
    }

    Node root;

    public boolean checkBST(Node root){
        return checkBST(root, null, null);
    }

    public boolean checkBST(Node node, Integer min, Integer max){
        if(node == null)
            return true;

        if((min != null && node.data <= min) || (max != null && node.data >= max))
            return  false;

        return checkBST(node.left, min, node.data) && checkBST(node.right, node.data, max);
    }
}
