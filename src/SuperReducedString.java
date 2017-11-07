import java.util.Scanner;

/**
 * teve has a string, S, consisting of n lowercase English alphabetic letters. In one operation,
 * he can delete any pair of adjacent letters with same value. For example, string "aabcc" would
 * become either "aab" or "bcc" after 1 operation.
 * Steve wants to reduce S as much as possible. To do this, he will repeat the above operation as
 * many times as it can be performed. Help Steve out by finding and printing 's non-reducible form!
 *
 * Note: If the final string is empty, print Empty String
 *
 * Sample Input:
 *  aaabccdddaa
 *  baab
 *
 * Sample Output:
 *  abd
 *  Empty String
 */
public class SuperReducedString {

    public String testReduction(String s){
        StringBuilder result = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            if(i+1 >= s.length() || s.charAt(i) !=  s.charAt(i+1)){
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String args[]){
        String s = "aaaabbbbccddddaa";
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                s = s.substring(0,i-1) + s.substring(i);
                i=0;
            }
        }
        System.out.println((s.length() == 0) ? "Empty String" : s);
        System.out.println(new SuperReducedString().testReduction(s));
    }
}
