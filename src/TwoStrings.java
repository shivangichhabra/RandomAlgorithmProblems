import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Given two strings, a and b, determine if they share a common substring.
 *
 * Sample Input:
 *  hello
 *  World
 *
 * Sample Output
 *  YES
 *
 * Sample Input
 *  rmpwlddwttapjzhdldjmuhmgruufltzszprzdcziigc
 *  bbvvkeqkqekqqennyxqxkxnyxnyqnnybnbvnyqqe
 *
 * Sample Output
 *  NO
 */
public class TwoStrings {
    public boolean compareStrings(String s, String r){
        HashSet<Character> set = new HashSet<>();

        for(int i =0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        for(int i=0; i<r.length(); i++){
            if(set.contains(r.charAt(i)))
                return true;
        }
        return false;
    }

    public static void main(String args[]){
        TwoStrings ts = new TwoStrings();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = sc.next();
        System.out.println(ts.compareStrings(s, r)? "YES" : "NO");
    }
}