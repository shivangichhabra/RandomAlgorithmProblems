import java.util.Scanner;

/**
 * Converts String to Integer
 *
 * Sample Input:
 *  "-12345"
 *
 * Sample Output:
 * -12345
 */
public class ATOI {

    public int StringToInt(String s){
        int num = 0;
        boolean isNeg = false;
        int i=0;
        if(s.length()> 0) {
            if (s.charAt(0) == '-') {
                isNeg = true;
                i = 1;
            }
            while (i < s.length()) {
                int x = s.charAt(i) - '0';
                num = x + num * 10;
                i++;
            }
        }
        if(isNeg)
            return -1*num;
        return num;
    }

    public static void main(String args[]){
        ATOI atoi = new ATOI();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(atoi.StringToInt(input));
    }
}
