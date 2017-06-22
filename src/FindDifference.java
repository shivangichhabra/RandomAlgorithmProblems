import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by keepi on 6/18/2017.
 */
public class FindDifference {
    public static void main(String args[]){
        String s = "a";
        String t = "aa";

        int result = 0;
        for(int i=0; i<t.length(); i++){
            result += t.charAt(i);
        }


        for(int i=0; i<s.length(); i++){
            result -= s.charAt(i);
        }

        int x = 34;
        System.out.println(Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString()));
        System.out.println(result  + "   " + (char)result);
    }
}
