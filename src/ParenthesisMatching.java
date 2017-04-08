import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Shivangi on 12/30/2016.
 */
public class ParenthesisMatching {
    /*
    O(n)
     */
    public static boolean validateParenthesis(String s){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        Stack<Character>  stackChar = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);

            if(map.keySet().contains(curr)){
                stackChar.push(curr);
            }else if(map.values().contains(curr)){
                if(!stackChar.isEmpty() && map.get(stackChar.peek()) == curr){
                    stackChar.pop();
                } else{
                    return false;
                }

            }
        }
        return stackChar.isEmpty();
    }

    public static void main(String args[]){
        ParenthesisMatching pm = new ParenthesisMatching();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(pm.validateParenthesis(s));
    }
}
