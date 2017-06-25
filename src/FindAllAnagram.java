import java.util.ArrayList;
import java.util.List;

/**
 * Created by keepi on 6/24/2017.
 */
public class FindAllAnagram {

    public List<Integer> findAllAnagramsIndex(String s, String p){
        List<Integer> list = new ArrayList<>();
        if(s == null || s.length() == 0 || p == null || p.length() == 0)
            return list;

        int[] hash = new int[256];
        for(char c : p.toCharArray()){
            hash[c]++;
        }

        int left = 0 , right = 0, count = p.length();
        while(right < s.length()){
            if(hash[s.charAt(right++)]-- >= 1)
                count--;

            if(count == 0)
                list.add(left);

            if(right-left == p.length() && hash[s.charAt(left++)]++ >= 0)
                count++;
        }
        return list;
    }

    public static void main(String args[]){
        FindAllAnagram fa = new FindAllAnagram();
        List<Integer> l = fa.findAllAnagramsIndex("abddhsjcfbadsab", "ab");

        for(int i=0; i<l.size(); i++)
            System.out.print(l.get(i) + " ");
    }
}
