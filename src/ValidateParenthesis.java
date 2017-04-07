import java.util.Stack;

/**
 * Created by Shivangi on 3/8/2017.
 */
public class ValidateParenthesis {
    public static boolean Validate(String s){
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            if(c == '[')
                stack.push(']');
            else if(c == '(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String args[]){
        String s = "{}()[]";
        System.out.println(Validate(s));
    }
}