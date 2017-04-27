import java.util.Arrays;

/**
 * Created by Shivangi on 4/15/2017.
 */
public class LongestCommonPrefix {

    public String LCP(String[] s){
        if(s == null || s.length == 0)
            return "";

        String one = s[0];
        int i=1;
        while(i<s.length){
            while(s[i].indexOf(one) != 0){
                one = one.substring(0, one.length()-1);
            }
            i++;
        }
        return one;
    }

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

    }
}
