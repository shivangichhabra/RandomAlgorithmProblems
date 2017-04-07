/**
 * Created by Shivangi on 3/8/2017.
 */
public class Palindrome {

    public static boolean isValid(String s){
        int start = 0;
        int end = s.length()-start-1;
        while (start <= end) {
            while (start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
                end++;
            }
            if (start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;

            start++;
            end--;
        }
        return true;
    }

    public static void main(String args[]){
        String s = "abb ;ba";
        System.out.println(isValid(s));
    }
}
