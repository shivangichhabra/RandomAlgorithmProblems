import java.util.Iterator;
import java.util.Stack;

/**
 * Created by FS047207 on 4/12/2017.
 */
public class SortStack {

    public Stack sort(Stack<Integer> s){
        Stack<Integer> sortedStack = new Stack<>();
        while(!s.isEmpty()){
            int temp = s.pop();
            while(!sortedStack.isEmpty() && sortedStack.peek() > temp){
                s.push(sortedStack.pop());
            }
            sortedStack.push(temp);
        }
        return sortedStack;
    }

    public static void main(String args[]){
        SortStack ss = new SortStack();
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(5);
        s.add(12);
        s.add(3);
        s.add(7);

        Stack<Integer> out = ss.sort(s);
        Iterator<Integer> it = out.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
