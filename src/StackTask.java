import java.util.*;

/**
 * A string containing only parentheses is balanced if the following is true: 1.
 * if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is
 * correct, (A) and {A} and [A] are also correct.
 *
 * Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" .
 * Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
 * Given a string, determine if it is balanced or not.
 *
 * Sample Input:
 *  {}()
 *  ({()})
 *  {}(
 *  []
 *
 * Sample Output:
 *  true
 *  true
 *  false
 *  true
 */
public class StackTask {
    public boolean test(HashMap<Character, Character> map ,String input){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);

            if(map.keySet().contains(c)){
                stack.push(c);
            } else if(map.values().contains(c)){
                if(!stack.isEmpty() && map.get(stack.peek()) == c){
                    stack.pop();
                }
                else{
                    System.out.println("Invalid input");
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String []argh)
    {
        StackTask st = new StackTask();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(st.test(map,input));
        }

    }
}

