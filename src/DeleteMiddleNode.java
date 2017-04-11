/**
 * Created by Shivangi on 4/8/2017.
 */
public class DeleteMiddleNode {

    public void deleteNode(LinkedListNode node){
        if(node != null && node.next != null){
            LinkedListNode next = node.next;
            node.data = next.data;
            node.next = next.next;
        }
    }

    public static void main(String args[]){
        LinkedListNode l = new LinkedListNode(0, null, null);
        LinkedListNode head = l;
        for(int i=1; i <10; i++){
            LinkedListNode current = new LinkedListNode((i*2+5), null, null);
            head.setNext(current);
            current.setPrev(head);
            head = current;
        }
        System.out.println(l.display());
        DeleteMiddleNode dmn = new DeleteMiddleNode();
        dmn.deleteNode(l);
        System.out.println(l.display());
    }
}
