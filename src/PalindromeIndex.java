import java.util.Scanner;

/**
 * Given a string, S, of lowercase letters, determine the index of the character whose removal will make S a palindrome.
 * If S is already a palindrome or no such character exists, then print -1. There will always be a valid solution, and any
 * correct answer is acceptable. For example, if S = "bcbc", we can either remove 'b' at index 0 or 'c' at index .3
 *
 * Sample Input:
 *  3
 *  aaab
 *  baa
 *  aaa
 *
 * Sample Output:
 *  3
 *  0
 *  -1
 */
public class PalindromeIndex {


    public int checkPalindromeIndex1(String s){
        for(int j=0; j<s.length(); j++){
            for(int i=0; i<s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)){
                    if(s.charAt(i+1) == s.charAt(s.length()-i-1) && s.charAt(i+2) == s.charAt(s.length()-i-2))
                        return i;
                    else
                        return s.length()-i-1;
                }
            }
        }
        return -1;
    }


    public  int checkPalindromeIndex2(String s){
        if(s.length() == 0 || s == null || s.equals(new StringBuilder(s).reverse().toString()))
            return -1;

        for(int i=0; i<s.length(); i++){
            String temp = s.substring(0,i)+s.substring(i+1);
            if(temp.equals(new StringBuilder(temp).reverse().toString()))
                return i;
        }
        return -1;
    }

    public static void main(String args[]){
        PalindromeIndex p = new PalindromeIndex();
        String s = "aab";
        System.out.println(p.checkPalindromeIndex1(s));
        System.out.println(p.checkPalindromeIndex2(s));
    }
}
