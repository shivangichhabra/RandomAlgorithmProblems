import java.util.Scanner;

/**
 * Julius Caesar protected his confidential information by encrypting it in a cipher.
 * Caesar's cipher rotated every letter in a string by a fixed number, , making it
 * unreadable by his enemies. Given a string, , and a number, , encrypt  and print
 * the resulting string.
 *
 * Sample Input:
 *  middle-Outz
 *  2
 *
 * Sample Output:
 *  okffng-Qwvb
 */
public class CaesarCipher {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s = sc.next();
        int k = sc.nextInt();
        int code;
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i);
            if(s.toUpperCase().charAt(i) >= 65 &&  s.toUpperCase().charAt(i) <= 90 ) {
                code = c < 97 ? c - 65 : c - 97;
                code = code + k;
                code = code % 26;
                sb.append((char)(c < 97 ? code + 65 : code + 97));

            } else {
                sb.append((char)(c));
            }
        }
        System.out.println(sb.toString());
    }
}
