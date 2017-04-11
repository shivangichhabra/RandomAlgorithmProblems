/**
 * Created by Shivangi on 4/8/2017.
 */
public class SumLists {

    public static LinkedListNode addLists(LinkedListNode first, LinkedListNode second, int carry) {
        if(first == null && second == null && carry == 0)
            return null;

        LinkedListNode result = new LinkedListNode();
        int value = carry;
        if(first != null)
            value += first.data;
        if( second != null)
            value += second.data;

        result.data = value % 10;

        if( first != null || second != null) {
            LinkedListNode next = addLists(first != null ? first.next : null,
                                           second != null ? second.next : null,
                                           value >= 10 ? 1 : 0);
            result.setNext(next);
        }
        return  result;
    }

    public static int linkedListToInt(LinkedListNode node) {
        int value = 0;
        if (node.next != null) {
            value = 10 * linkedListToInt(node.next);
        }
        return value + node.data;
    }

    public static void main(String args[]){
        LinkedListNode lA1 = new LinkedListNode(7, null, null);
        LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(6, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(5, null, null);
        LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(2, null, lB2);

        LinkedListNode list3 = addLists(lA1, lB1, 0);

        System.out.println("  " + lA1.display());
        System.out.println("+ " + lB1.display());
        System.out.println("= " + list3.display());

        int l1 = linkedListToInt(lA1);
        int l2 = linkedListToInt(lB1);
        int l3 = linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));
    }
}