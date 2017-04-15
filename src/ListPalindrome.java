import java.util.Stack;

/**
 * Created by Shivangi on 4/8/2017.
 */
public class ListPalindrome {


    public LinkedListNode reverseList(LinkedListNode node){
        LinkedListNode head = null;
        while(node != null){
            LinkedListNode newNode = new LinkedListNode(node.data);
            newNode.next = head;
            head = newNode;
            node = node.next;
        }
        return head;
    }

    public boolean isPalindrome(LinkedListNode head ){
        LinkedListNode tail = reverseList(head);
        return isEqual(head, tail);
    }

    public boolean isEqual(LinkedListNode head, LinkedListNode tail){
        while(head != null && tail != null){
            if(head.data != tail.data){
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return head == null && tail == null;
    }

    public boolean checkPalindromWithStack(LinkedListNode head){
        LinkedListNode slowRunner = head;
        LinkedListNode fastRunner = head;
        Stack<Integer> stack = new Stack<>();

        while(fastRunner != null && fastRunner.next != null){
            stack.push(slowRunner.data);
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }

        if(fastRunner!= null){ //means odd number of elements
            slowRunner = slowRunner.next;
        }

        //reached mid point
        while (slowRunner != null){
            int top = stack.pop().intValue();
            if(top != slowRunner.data)
                return false;

            slowRunner = slowRunner.next;
        }
        return  true;
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

        LinkedListNode l = nodes[0];
        ListPalindrome lp = new ListPalindrome();
        System.out.println(l.display());
        System.out.println(lp.isPalindrome(l));
        System.out.println(lp.checkPalindromWithStack(l));
    }
}

