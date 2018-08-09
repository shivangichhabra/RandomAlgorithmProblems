import java.util.Scanner;

/**
 * Steve has a string, S, consisting of n lowercase English alphabetic letters. In one operation,
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
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                s = s.substring(0,i-1) + s.substring(i+1);
                i=0;
            }
        }
        return s;
    }

    public static void main(String args[]){
        String s = "aaabccdddaa";
        System.out.println(new SuperReducedString().testReduction(s));
    }
}
