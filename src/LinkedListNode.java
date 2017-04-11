/**
 * Created by Shiavngi on 4/8/2017.
 */
public class LinkedListNode {
    public LinkedListNode prev;
    public LinkedListNode next;
    public LinkedListNode last;
    int data;

    public LinkedListNode(){

    }

    public LinkedListNode(int d){
        this.data = d;
    }

    public LinkedListNode(int d, LinkedListNode n, LinkedListNode p){
        this.data = d;

    }

    public void setNext(LinkedListNode n){
        next = n;
        if(this == last)
            last = n;
        if(n != null && n.prev != this)
            n.setPrev(this);
    }

    public void setPrev(LinkedListNode p){
        prev = p;
        if(p != null && p.next != this)
            next.setNext(this);
    }

    public String display(){
        if(next != null)
            return data +"->"+next.display();
        return data+"";
    }

    public LinkedListNode clone(){
        LinkedListNode c = null;
        if(c != null)
            c = next.clone();
        LinkedListNode newNode = new LinkedListNode(data, c, null);
        return newNode;
    }

}
