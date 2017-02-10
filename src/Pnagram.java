import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Roy wanted to increase his typing speed for programming contests. So, his friend advised
 * him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because
 * it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet
 * at least once.)
 *
 * After typing the sentence several times, Roy became bored with it. So he started to look for
 * other pangrams.
 *
 * Given a sentence s, tell Roy if it is a pangram or not.
 *
 * Sample Input:
 *  We promptly judged antique ivory buckles for the next prize
 *  We promptly judged antique ivory buckles for the prize
 *
 * Sample Output:
 *  true
 *  false
 */
public class Pnagram {
    public boolean isPnagram(String s){
       Set<Character> set = new HashSet<>();
       for(int i=0;i<s.length(); i++){
           char c  = s.toLowerCase().charAt(i);
           if(c >= 97 && c<= 122) {
               set.add(c);
           }
       }
       System.out.println(set.size());
       return (set.size() == 26);
    }

    public static void main(String args[]){
        Pnagram p = new Pnagram();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(p.isPnagram(s));
    }
}
