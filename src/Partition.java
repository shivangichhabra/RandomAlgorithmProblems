/**
 * Created by Shivangi on 4/8/2017.
 */
public class Partition {

    public static LinkedListNode partition(LinkedListNode node, int k){
        LinkedListNode head = node;
        LinkedListNode tail = node;

        while(node != null){
            LinkedListNode next = node.next;
            if(node.data < k){
                //insert at front
                node.next = head;
                head = node;
            } else {
                // insert at the end
                tail.next = node;
                tail = node;
            }

            node = next;
        }
        tail.next = null;
        return  head;
    }

    public static void main(String args[]){
        int length = 20;
        LinkedListNode[] nodes = new LinkedListNode[length];
        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i + 1]);
            }
            if (i > 0) {
                nodes[i].setPrev(nodes[i - 1]);
            }
        }

        LinkedListNode l = nodes[0];
        System.out.println(l.display());
        LinkedListNode n = partition(l,4);
        System.out.println(n.display());
    }
}
