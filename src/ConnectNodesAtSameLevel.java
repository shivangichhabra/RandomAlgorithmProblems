/**
 * Created by Shivangi on 6/26/2017.
 */
public class ConnectNodesAtSameLevel {
    static class Node{
        int val;
        Node left;
        Node right;
        Node nextRight;

        Node(int val){
            this.val = val;
            left = right = nextRight = null;
        }
    }

    Node root;
    public void connect(Node root){
        root.nextRight = null;
        connectPreOrder(root);
    }

    public void connectPreOrder(Node n){
        if( n==null)
            return;

        if(n.left != null)
            n.left.nextRight = n.right;

        if(n.right != null)
            n.right.nextRight = n.nextRight != null ? n.nextRight.left : null;

        connectPreOrder(n.left);
        connectPreOrder(n.right);
    }


    public static void main(String args[]){
        ConnectNodesAtSameLevel tree = new ConnectNodesAtSameLevel();

        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);

        tree.connect(tree.root);
    }
}
