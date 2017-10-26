import java.util.Stack;

/**
 * Created by Shivangi on 4/12/2017.
 */
public class StackMin extends Stack<Integer>{

   Stack<Integer> minStack;

    public StackMin(){
        minStack = new Stack<>();
    }

    public void push(int data){
        if(data <= min()){
            minStack.push(data);
        }
        super.push(data);
    }

    public Integer pop(){
        int data = super.pop();
        if(min() == data){
            minStack.pop();
        }
        return data;
    }

    public Integer min(){
        return minStack.isEmpty() ? Integer.MAX_VALUE : minStack.peek();
    }


    public static void main(String args[]){
        StackMin sm = new StackMin();
        sm.push(4);
        System.out.println(sm.min());
        sm.push(2);
        sm.push(1);
        System.out.println(sm.min());
        System.out.println(sm.pop());
        System.out.println(sm.min());
        sm.push(0);
        sm.push(3);
        sm.push(8);
        System.out.println(sm.min());
        System.out.println(sm.pop());
        System.out.println(sm.min());
    }
}
