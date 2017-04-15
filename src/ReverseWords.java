import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Shivangi on 3/12/2017.
 */
public class ReverseWords {

    public static String reverseWords(String s){
        if(s.length() == 0)
            return "";

        StringBuilder builder = new StringBuilder();
        String str[] = s.split("\\s");
        for(int i=str.length-1; i>=0; i--){
            builder.append(str[i] + " ");
        }
        return builder.toString().trim();
    }

    public static String reverseInplace(String s){
        if(s.length() == 0)
            return "";
        String words[] = s.split("\\s");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = "Let's do  this"; //sc.nextLine();
        System.out.println(reverseWords(s));
        System.out.println(reverseInplace(s));
    }
}
