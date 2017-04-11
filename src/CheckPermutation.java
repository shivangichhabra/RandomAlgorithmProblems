import java.util.Arrays;

/**
 * Created by Shivangi on 4/5/2017.
 */
public class CheckPermutation {

    /*
    O(nlog n)
    sort and check if all the char matches in both the strings
     */
    public boolean arePermutaions1(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1); Arrays.sort(c2);

        for(int i=0; i<s1.length(); i++){
            if(c1[i] != c2[i])
                return false;
        }

        return true;
    }

    /*
    put all the chars of first string in hash table
    remove all the chars from table are already in hashtable
    and see if size is 0
     */
    public boolean arePermutaions2(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        int[] hash = new int[128];

        for(int i=0; i<s1.length(); i++){
            hash[s1.charAt(i)]++;
        }

        for(int i=0; i<s2.length(); i++){
            hash[s2.charAt(i)]--;
            if(hash[s2.charAt(i)] <0)
                return false;
        }

        return true;
    }

    public static void main(String args[]){
        CheckPermutation cp = new CheckPermutation();
        System.out.println(cp.arePermutaions1("silent1234","listen4123"));
        System.out.println(cp.arePermutaions2("silent3124","listen3421"));
    }
}
