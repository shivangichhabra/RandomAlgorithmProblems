/**
 * Created by Shivangi on 4/8/2017.
 */
public class IntersectionInList {

    public LinkedListNode findIntersection(LinkedListNode list1, LinkedListNode list2) {
        if(list1 == null && list2 == null){
            return  null;
        }

        Data d1 = getTailAndSize(list1);
        Data d2 = getTailAndSize(list2);

        if(d1.tail != d2.tail){
            return null;
        }

        LinkedListNode shorter = d1.size > d2.size ? list2 : list1;
        LinkedListNode longer =  d1.size < d2.size ? list2 : list1;

        int n = Math.abs(d1.size - d2.size);

        // move longer array n steps ahead
        longer = getKthNode(longer, n);

        while( shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }

        return longer;
    }

    LinkedListNode getKthNode(LinkedListNode node, int k){
        LinkedListNode current = node;

        while(k> 0 && current != null ){
            current = current.next;
            k--;
        }
        return current;
    }


    public static void main(String args[]){
        LinkedListNode firstNode = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode list1 = firstNode;
        LinkedListNode l1 = firstNode;
        for (int i = 1; i < 8; i++) {
            l1 = new LinkedListNode(i, null, null);
            firstNode.setNext(l1);
            l1.setPrev(firstNode);
            firstNode = l1;
        }

        LinkedListNode secondNode = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode list2 = secondNode;
        LinkedListNode l2 = secondNode;
        for (int i = 1; i < 8; i++) {
            l2 = new LinkedListNode(i+5, null, null);
            secondNode.setNext(l2);
            l2.setPrev(secondNode);
            secondNode = l2;
        }

        list2.next.next = list1.next.next.next.next;

        System.out.println(list1.display());
        System.out.println(list2.display());

        LinkedListNode intersection = new IntersectionInList().findIntersection(list1, list2);
        System.out.println("Intersecting node :" + intersection.data);
        System.out.println("remaning list:" + intersection.display());
    }

    Data getTailAndSize(LinkedListNode head){
        if(head == null)
            return null;

        int count = 1;
        LinkedListNode temp = head;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        return new Data(temp, count);
    }

    class Data {
        public LinkedListNode tail;
        public int size;

        public Data(LinkedListNode node, int x) {
            tail = node;
            size = x;
        }
    }
}
