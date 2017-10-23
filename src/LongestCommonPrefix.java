import java.util.Arrays;

/**
 * Created by Shivangi on 4/15/2017.
 */
public class LongestCommonPrefix {

    public String sortedStringPrefix(String[] s){
        Arrays.sort(s);

        if(s != null && s.length > 0){

            String first = s[0];
            String last = s[s.length-1];

            while(last.indexOf(first) != 0){
                first = first.substring(0, first.length()-1);
            }
            return first;
        }
        return "";
    }

    public static void main(String args[]){
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] s = {"ead", "eat", "eaten"};
        System.out.println(lcp.sortedStringPrefix(s));
    }
}
