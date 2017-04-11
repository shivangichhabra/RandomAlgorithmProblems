/**
 * Created by Shivangi on 4/8/2017.
 */
public class LoopDetectionInList {

    public LinkedListNode detectLoop(LinkedListNode head){
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }

        if(fast == null || fast.next == null)
            return null;

        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    public static void main(String args[]){
        int len = 9;
        LinkedListNode[] nodes = new LinkedListNode[len];
        for(int i=0; i<len; i++){
            nodes[i] = new LinkedListNode(i >= len/2 ? len-i-1 : i, null, null);
        }

        for(int i=0; i<len; i++){
            if(i<len-1)
                nodes[i].setNext(nodes[i+1]);
            if(i>0)
                nodes[i].setPrev(nodes[i-1]);
        }

        LoopDetectionInList ld = new LoopDetectionInList();
        LinkedListNode head = ld.detectLoop(nodes[0]);

        if (head == null) {
            System.out.println("No Cycle.");
        } else {
            System.out.println(head.data);
        }
    }
}
