/**
 * Created by FS047207 on 6/27/2017.
 */
public class GetPathSum {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    Node root;

    int max = Integer.MIN_VALUE;

    /*
    Get the max path sum in a BT
     */
    public int maxPathSum(Node root) {
        getMaxPath(root);
        return max;
    }

    public int getMaxPath(Node n){
        if(n == null)
            return 0;

        int left = Math.max(0, getMaxPath(n.left));
        int right = Math.max(0, getMaxPath(n.right));
        max = Math.max(max, left+right+n.data);
        return n.data+Math.max(left, right);
    }

    public static void main(String args[]){
        GetPathSum tree = new GetPathSum();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println(tree.maxPathSum(tree.root));
    }
}
