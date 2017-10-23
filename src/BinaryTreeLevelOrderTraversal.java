import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shivangi on 6/24/2017.
 */
public class BinaryTreeLevelOrderTraversal {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();
        return traverseLevelOrder(root, lists, 0); //lists;
    }

    public List<List<Integer>> traverseLevelOrder(TreeNode root, ArrayList<List<Integer>> lists, int level){
        if(root == null)
            return new ArrayList<List<Integer>>() ;

        List<Integer> list = null;
        if(lists.size() == level){
            //create new list
            list = new LinkedList<Integer>();
            lists.add(list);
        } else {
            //it exists already, get it
            list = lists.get(level);
        }

        list.add(root.val);
        traverseLevelOrder(root.left, lists, level+1);
        traverseLevelOrder(root.right, lists, level+1);
        return lists;
    }
}
