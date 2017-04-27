/**
 * Created by Shivangi on 4/20/2017.
 */
public class MirrorImageTree {

    class Node{
        Node left;
        Node right;
        int value;

    }

    public boolean isMirror(Node a , Node b){
        if(a == null && b == null)
            return true;

        if(a != null && b != null && a.value == b.value){
            return isMirror(a.left, b.right) && isMirror(a.right, b.left);
        }

        return false;
    }
}
