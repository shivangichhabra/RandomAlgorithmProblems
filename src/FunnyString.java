import java.util.Scanner;

/**
 * Suppose you have a String, S, of length N that is indexed from 0 to N-1. You also
 * have some String, R, that is the reverse of String S. S is funny if the condition
 * |S[i] - s[i-1]|  = |R[i] - R[i-1]| is true for every character i from 1 to N-1.
 *
 * Sample Input:
 *  acxz
 *  bcxz
 *
 * Sample Output:
 *  Funny
 *  Not Funny
 */
public class FunnyString {

    public boolean funnyString(String str, String reverse){
        for(int i=1; i<str.length(); i++){
            int x = Math.abs(str.charAt(i) - str.charAt(i-1));
            int y = Math.abs(reverse.charAt(i) - reverse.charAt(i-1));
            if( x != y){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        FunnyString fs = new FunnyString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder rev = new StringBuilder(str);
        String reverse = rev.reverse().toString();
        System.out.println(fs.funnyString(str,reverse) ? "Funny" :"Not Funny");
    }
}
