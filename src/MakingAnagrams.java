import java.util.Scanner;

/**
 * Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams of
 * each other if the first string's letters can be rearranged to form the second string. In other words, both strings
 * must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc
 * and dcbad are not.
 *
 * Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number
 * of character deletions required to make the two strings anagrams. Can you help her find this number?
 *
 * Given two strings, a and b, that may or may not be of the same length, determine the minimum number of character
 * deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.
 *
 * Sample Input:
 *  cde
 *  abc
 *
 * Sample Output:
 *  4
 */
public class MakingAnagrams {

    /*
    O(n)
     */
    public int Method1(String a, String b) {
        int size = a.length() + b.length();
        int ch[] = new int[26];

        for (int i = 0; i < a.length(); i++) {
            ch[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            if (ch[b.charAt(i) - 'a'] > 0) {
                ch[b.charAt(i) - 'a']--;
                size -= 2;
            }
        }

        return size;
    }

    public int Method2(String a, String b) {
        int[] c1 = getCount(a);
        int[] c2 = getCount(b);

        int removal = 0;
        for (int i = 0; i < 26; i++) {
            removal += Math.abs(c1[i] - c2[i]);
        }
        return removal;
    }

    public int[] getCount(String s) {
        int chars[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }
        return chars;
    }

    public static void main(String args[]) {
        MakingAnagrams ma = new MakingAnagrams();

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(ma.Method2(a, b));
    }
}