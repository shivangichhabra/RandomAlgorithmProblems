/**
 * Created by Shivangi on 4/6/2017.
 */
public class PalindromePermutation {

    public boolean isPalindromePermutation(String s){
        int[] alpha = new int[26];
        int countOdd = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.toLowerCase().charAt(i);
            if(c >= 'a' && c <='z') {
                alpha[c - 'a']++;
                if(alpha[c - 'a']%2 != 0)
                    countOdd++;
                else
                    countOdd--;
            }
        }
        return countOdd<=1;
    }

    public static void main(String args[]){
        PalindromePermutation pp = new PalindromePermutation();
        System.out.println(pp.isPalindromePermutation("Tact coaos"));
    }
}
