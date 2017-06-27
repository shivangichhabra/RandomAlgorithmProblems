/**
 * Created by FS047207 on 6/26/2017.
 */
public class CousinOfBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    Node root;

    public boolean isCousin(Node root, Node a, Node b) {
        if (root == null)
            return false;

        return (level(root, a, 1) == level(root, b, 1) || !isSibling(root,a,b));
    }

    public boolean isSibling(Node  root, Node a, Node b){
        if(root == null)
            return false;

        return (root.left == a && root.right == b) || (root.left == b && root.right == a)
           || isSibling(root.left, a, b) || isSibling(root.right, a, b) ;
    }

    public int level(Node root, Node n, int level ){
        if(root == null)
            return 0;

        if(root == n)
            return level;

        int l = level(root.left, n, level);
        if(l != 0)
            return l;
        return level(root.right, n, level);
    }

    public static void main(String args[]){
        CousinOfBinaryTree tree = new CousinOfBinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(15);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);

        Node a = tree.root.left.left;
        Node b = tree.root.right.right;

        System.out.println(tree.isCousin(tree.root, a, b) ? "Yes" : "No");

    }
}
