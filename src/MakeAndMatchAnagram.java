import java.util.Scanner;

/**
 * Sid is obsessed with reading short stories. Being a CS student, he is doing some interesting frequency analysis with
 * the books. He choses strings S1 and S2 in such a way that |len(S1) - len(S2)| <= 1.
 *
 * Sample Input:
 *  xaxbbbxx
 *
 * Sample Output:
 *  1
 */
public class MakeAndMatchAnagram {

    public int getcount(String s){
        if(s.length() % 2 != 0) {
            return -1;
        }
        int[] letters = new int[26];
        String c1 = s.substring(0, s.length()/2);
        for (int i = 0; i < c1.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }

        String c2 = s.substring(s.length()/2);
        for (int i = 0; i < c2.length(); i++) {
            if (letters[c2.charAt(i) - 'a'] > 0)
                letters[c2.charAt(i) - 'a']--;
        }

        int count=0;
        for (int i = 0; i < letters.length; i++) {
            count += letters[i];
        }
        return count;
    }

    public static void main(String args[]){
        MakeAndMatchAnagram mma = new MakeAndMatchAnagram();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(mma.getcount(s));
    }
}
