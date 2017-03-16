import java.util.HashSet;
import java.util.Scanner;

/**
 * Amanda has a string, s, of m lowercase letters that she wants to copy into a new string, p. She can perform the following operations any number of times to construct string :
 *
 *  a.) Append a character to the end of string p at a cost of 1 dollar.
 *  b.) Choose any substring of p and append it to the end of p at no charge.
 *
 * Sample Input:
 *  abcd
 *  abab
 *
 * Sample Output:
 *  4
 *  2
 */
public class StringConstruction {
    public int getCount(String s){
        HashSet<Character> charSet = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            charSet.add(s.charAt(i));
        }

        return charSet.size();
    }
    public static void main(String args[]) {
        StringConstruction sc = new StringConstruction();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            String s = scan.next();
            System.out.println(sc.getCount(s));
        }
    }
}
