import java.util.LinkedList;

/**
 * Created by Shivangi on 6/26/2017.
 */
public class PrintAllRootToLeafPath {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    Node root;
    public void printPath(Node n){
        int[] path = new int[1000];
        LinkedList<Integer> list = new LinkedList<Integer>();
        printRecPath(n, path, 0);
    }

    public void printRecPath(Node n, int[] path, int len){
        if(n == null)
            return;

        path[len] =  n.data;
        len++;

        if(n.left == null && n.right == null)
            print(path, len);
        else{
            printRecPath(n.left, path, len);
            printRecPath(n.right, path, len);
        }
    }

    public void print(int[] path, int len){
        for(int i=0; i<len; i++)
            System.out.print(path[i] + "  ");
        System.out.println("");
    }
    public static void main(String args[]){
        PrintAllRootToLeafPath tree = new PrintAllRootToLeafPath();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(1);
        tree.root.right.left.right = new Node(0);

        tree.printPath(tree.root);

    }
}
