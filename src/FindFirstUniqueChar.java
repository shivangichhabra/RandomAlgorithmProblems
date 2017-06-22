import java.util.*;

/**
 * Created by keepi on 6/19/2017.
 */
public class FindFirstUniqueChar {

    public static int firstUniqCharOne(String s) {
        char[] c = s.toCharArray();

        for(int i=0; i<s.length(); i++)
            if(s.indexOf(c[i]) == s.lastIndexOf(c[i]))
                return i;

        return -1;
    }

    public static int firstUniqCharTwo(String s) {
        int[] chars = new int[26];
        for(int i=0; i<s.length(); i++)
            chars[s.charAt(i)-'a']++;

        for(int i=0; i<s.length(); i++){
            if(chars[s.charAt(i)-'a'] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String args[]){
        System.out.println(firstUniqCharOne("lsampleinputisanapple"));
        System.out.println(firstUniqCharTwo("lsampleinputisanapple"));
    }
}
