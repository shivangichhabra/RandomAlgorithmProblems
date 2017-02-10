import java.util.Scanner;

/**
 * Alice has a binary string, B, of length n. She thinks a binary string is beautiful if
 * and only if it doesn't contain the substring "010".
 *
 * In one step, Alice can change a 0 to a 1 (or vice-versa). Count and print the minimum number
 * of steps needed to make Alice see the string as beautiful.
 *
 * Sample Input:
 * 0101010
 *
 * Sample Output:
 * 2
 */
public class BeautifyBinaryString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count =0;
        for(int i=0; i<s.length()-2; i++){
            if(s.substring(i, i+3).equals("010")) {
                s = s.substring(0, i) + "  " + s.substring(i + 3);
                count++;
            }
        }
        System.out.println(count);
    }
}
