import java.util.HashSet;
import java.util.Scanner;

/**
 * This class if designed to check if the given string is a permutation
 * of a palindrome.
 *
 * Sample Input:
 *  aaabbbb
 *
 * Sample Output:
 *  YES
 *
 * Sample Input:
 *  aaabbbbb
 *
 * SampleO Output:
 *   NO
 */
public class PermutationPalindrome {

    public boolean checkIfPalindromPermutationMethod1(String s){
        int hash[] = new int[128];
        int countOdd = 0;
        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i)]++;
            if(hash[s.charAt(i)] % 2 != 0)
                countOdd++;
            else
                countOdd--;
        }
        return countOdd > 1 ? false : true;
    }

    public boolean checkIfPalindromPermutationMethod2(String s){
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        return set.size() > 1 ? false : true;
    }

    public static void main(String args[]){
        PermutationPalindrome pp = new PermutationPalindrome();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(pp.checkIfPalindromPermutationMethod1(s));
        System.out.println(pp.checkIfPalindromPermutationMethod2(s));
    }
}
