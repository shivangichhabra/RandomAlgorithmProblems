import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by FS047207 on 4/12/2017.
 */
public class StackOfPlates {
    ArrayList<Stack> listOfStacks = new ArrayList<>();
    int capacity;

    public StackOfPlates(int capacity){
        this.capacity = capacity;
    }

    public Stack getLastStack(){
        return listOfStacks.size() == 0? null: listOfStacks.get(listOfStacks.size() - 1);
    }

    public void push(int data){
        Stack last = getLastStack();
        if(last != null && last.size() < capacity){
            last.push(data);
        } else {
            Stack newstack = new Stack();
            newstack.push(data);
            listOfStacks.add(newstack);
        }
    }

    public int pop(){
        Stack last = getLastStack();
        if(last == null) throw new EmptyStackException();
        int v = (int) last.pop();
        if(last.size() == 0)
            listOfStacks.remove(listOfStacks.size() - 1);
        return v;
    }

    public boolean isEmpty(){
        return getLastStack() == null || getLastStack().isEmpty();
    }
}
