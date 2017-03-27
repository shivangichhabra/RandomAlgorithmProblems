import java.util.Scanner;

/**
 * James found a love letter his friend Harry has written for his girlfriend. James is a prankster, so he decides
 * to meddle with the letter. He changes all the words in the letter into palindromes.To do this, he follows two rules:
 *
 * He can reduce the value of a letter, e.g. he can change d to c, but he cannot change c to d.
 * In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until the letter
 * becomes a. Once a letter has been changed to a, it can no longer be changed.
 * Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations
 * required to convert a given string into a palindrome.
 *
 * Sample Input:
 *  4
 *  abc
 *  abcba
 *  abcd
 *  cba
 *
 * Sample Output:
 *  2
 *  0
 *  4
 *  2
 */
public class LetterMystery {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc.next();
            char[] c = s.toCharArray();
            int count = 0;
            int size= c.length;
            for(int j=0; j<size/2; j++){
                if(c[j] != c[size-j-1]){
                    count += (int)(Math.abs(c[j]-c[size-j-1]));
                }
            }
            System.out.println(count);
        }
    }
}
