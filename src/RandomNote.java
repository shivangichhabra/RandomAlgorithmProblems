import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Shivangi on 3/15/2017.
 */
public class RandomNote {

    public static boolean  getReply(int m, String[] magazine, int n, String[] ransom){
        if(m<n)
            return false;

        int i;
        List<String> mList = new ArrayList(Arrays.asList(magazine));
        for (i=0; i<ransom.length; i++){
            int index = mList.indexOf(ransom[i]);
            if(index > 0)
                mList.remove(index);
        }
        return  (i==ransom.length);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        System.out.println(getReply(m, magazine, n, ransom) ? "Yes" : "No");
    }
}
