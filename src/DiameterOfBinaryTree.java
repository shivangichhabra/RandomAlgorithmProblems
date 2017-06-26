/**
 * Created by FS047207 on 6/26/2017.
 */
public class DiameterOfBinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    Node root;

    public int getDiameter(Node n){
        if(n == null)
            return 0;

        int lD = getDiameter(n.left);
        int rD = getDiameter(n.right);

        int lH = getHeight(n.left);
        int rH = getHeight(n.right);

        return Math.max((1+lH+rH), Math.max(lD, rD));
    }

    public int getHeight(Node n){
        if(n == null)
            return 0;
         return 1 + Math.max(getHeight(n.left) , getHeight(n.right));
    }

    public static void main(String args[]){
        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(tree.getDiameter(tree.root));

    }
}
