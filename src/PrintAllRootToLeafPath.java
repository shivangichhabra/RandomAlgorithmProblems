import java.util.*;

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

    public ArrayList<String> printPath(Node root){
        String path = "";

        ArrayList<String> result = new ArrayList<String>();
        printRecPath(root, path, result);

        return result;
    }

    public void printRecPath(Node node, String path, List<String> list){
        if(node == null)
            return;

        path += node.data + " ";

        if(node.left == null && node.right == null){
            list.add(path);
        }

        if(node.left != null){
            printRecPath(node.left, path, list);
        }

        if(node.right != null){
            printRecPath(node.right, path, list);
        }
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

        List<String> output = tree.printPath(tree.root);
        for(int i=0; i<output.size(); i++){
            System.out.println(output.get(i));
        }
    }
}