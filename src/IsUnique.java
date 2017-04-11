import java.util.Arrays;

/**
 * Check if all the characters of this string are unique.
 *
 * Created by Shivangi on 4/5/2017.
 */
public class IsUnique {

    /*
    O(n^2)
     */
    public boolean ifUniqueChar1(String s){
        for(int i = 0; i<s.length()-1; i++){
            for(int j = i+1; j<s.length(); j++ ){
                if(s.charAt(i) == s.charAt(j))
                    return false;
            }
        }
        return true;
    }

    /*
    O(n log n)
     */
    public boolean ifUniqueChar2(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for(int i=0; i<s.length()-1; i++){
            if(c[i] == c[i+1])
                return false;
        }
        return true;
    }

    /*
    Considering String contains ASCII chars
    O(n)
     */
    public boolean ifUniqueChar3(String s){
        if(s.length()>128)
            return false;

        boolean[] hash = new boolean[128];
        for(char c : s.toCharArray()){
            if(hash[c])
                return false;
            hash[c] = true;
        }
        return true;
    }

    public static void main(String args[]){
        IsUnique iu = new IsUnique();
        System.out.println(iu.ifUniqueChar1("qawszxecdfvrgtbhyn 'lop.[];/+-0987654321&^$@*()!"));
        System.out.println(iu.ifUniqueChar2("qawszxecdfvrgtbhyn 'lop.[];/+-0987654321&^$@*()!"));
        System.out.println(iu.ifUniqueChar3("qawszxecdfvrgtbhyn 'lop.[];/+-0987654321&^$@*()!"));
    }
}
