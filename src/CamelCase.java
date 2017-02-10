import java.util.Scanner;

/**
 * Counts total number of words in camel case type string.
 *
 * Sample Input:
 *  helloToThisWorld
 *
 * Sample Output:
 *  4
 */
public class CamelCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count =0;
        if(s.length() > 0){
            count = 1;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) >= 65 && s.charAt(i) <= 90 ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
