import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shivangi on 4/8/2017.
 */
public class RemoveDupFromLinkedList {

    /*
    When extra space is used
    O(N) space
    O(N) time
     */
    public void removeDup(LinkedListNode node){
        Set<Integer> set = new HashSet<>();
        if(node != null){
            LinkedListNode current = node;
            LinkedListNode prev = null;
            while (current != null) {
                if(set.contains(current.data)){
                    prev.next = current.next;
                } else {
                    set.add(current.data);
                    prev = current;
                }
                current = current.next;
            }
        }
    }

    /*
    O(1) Time
    O(n^2) space
     */
    public void removeDupsWithPointers(LinkedListNode node){
        LinkedListNode current = node;
        while(current!= null){
            LinkedListNode runner = current;
            while(runner.next != null){
                if(runner.next.data == current.data)
                    runner.next = runner.next.next;
                else
                    runner = runner.next;
            }
            current = current.next;
        }
    }

    public static void main(String args[]){
        LinkedListNode l = new LinkedListNode(0, null, null);
        LinkedListNode head = l;
        for(int i=1; i <10; i++){
            LinkedListNode current = new LinkedListNode((i+3)/2, null, null);
            head.setNext(current);
            current.setPrev(head);
            head = current;
        }
        System.out.println(l.display());

        RemoveDupFromLinkedList rdl = new RemoveDupFromLinkedList();
        //rdl.removeDup(l);
        rdl.removeDupsWithPointers(l);
        System.out.println(l.display());
    }
}
