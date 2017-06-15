/**
 * Created by FS047207 on 6/15/2017.
 */
public class CheckBTforBST {
    class Node{
        Node left;
        Node right;
        int data;
    }

    Node root;

    public boolean checkBST(Node n){
        return checkBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean checkBST(Node n, int min, int max){
        if(n == null)
            return true;

        if(n.data <= min || n.data >= max)
            return  false;

        return checkBST(n.left, min, n.data) && checkBST(n.right, n.data,   max);
    }
}
