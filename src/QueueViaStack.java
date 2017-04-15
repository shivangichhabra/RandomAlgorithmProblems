import java.util.Stack;

/**
 * Created by FS047207 on 4/12/2017.
 */
public class QueueViaStack {

    Stack<Integer> main = new Stack<>();
    Stack<Integer> temp = new Stack<>();

    public void enqueue(int data){
        main.push(data);
    }

    public void dequeue(){
        shiftStacks();
        temp.pop();
    }

    public boolean isEmpty(){
        return temp.isEmpty() && main.isEmpty();
    }

    public int peek(){
        shiftStacks();
        return temp.peek();
    }

    public void shiftStacks(){
        if(temp.isEmpty()){
            while(!main.isEmpty())
                temp.push(main.pop());
        }
    }

    public static void main(String args[]){
        QueueViaStack queue = new QueueViaStack();
        System.out.println(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

    }

}
