import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by keepi on 6/25/2017.
 */
public class MergerKSortedLists {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode merge(ListNode[] lists){
        if(lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        //fill the queue
        for(ListNode list : lists){
            if(list != null)
                queue.add(list);
        }

        //get head node
        ListNode head = new ListNode(0);
        ListNode l = head;

        //merge one in sorted order
        while (!queue.isEmpty()){
            ListNode n = queue.poll();
            l.next = n;
            l = l.next;

            if(n.next != null)
                queue.add(n.next);
        }

        return head.next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);

        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(3);

        ListNode[] lists = {l1, l2};

        ListNode head = merge(lists);
        while( head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
