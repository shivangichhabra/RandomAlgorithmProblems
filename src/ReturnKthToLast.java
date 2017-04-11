/**
 * Created by Shivangi on 4/8/2017.
 */
public class ReturnKthToLast {

    public int size(LinkedListNode node){
        int count = 0;
        while(node != null){
            count++;
            node = node.next;
        }
        return count;
    }

    /*
    Iterative approcach when size of list if known
     */
    public int findK(LinkedListNode node, int k){
        int i = 0;
        int x = size(node) - k;
        while(node != null && i < x){
            node = node.next;
            i++;
            if(i == x){
                //prev.next = node.next; // if we have to remove it
                return node.data;
            }
        }
        return -1;
    }

    /*
    Recursive approach
     */
    public int printK(LinkedListNode node, int k){
        if(node == null)
            return 0;
        int index = printK(node.next, k) + 1;
        if(index == k)
            System.out.println("here" + node.data);
        
        return index;
    }

    public static void main(String args[]){
        LinkedListNode l = new LinkedListNode(0, null, null);
        LinkedListNode head = l;
        for(int i=1; i <10; i++){
            LinkedListNode current = new LinkedListNode(i, null, null);
            head.setNext(current);
            current.setPrev(head);
            head = current;
        }
        System.out.println(l.display());
        ReturnKthToLast k = new ReturnKthToLast();
        k.size(l);
        System.out.println(k.findK(l,7));
        System.out.println(k.printK(l,7));
        System.out.println(l.display());
    }
}
