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
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=0; j<n; j++){
            boolean flag = true;
            String s = sc.next();
            for(int i=0; i<s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)){
                    if(s.charAt(i+1) == s.charAt(s.length()-i-1) && s.charAt(i+2) == s.charAt(s.length()-i-2))
                        System.out.println(i);
                    else
                        System.out.println(s.length()-i-1);
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println("-1");
        }
    }
}
