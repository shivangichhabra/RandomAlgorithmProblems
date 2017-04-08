/**
 * Created by Shivangi on 3/9/2017.
 */
public class ReverseVowels {

    private boolean isVowel(char c){
        char v = Character.toLowerCase(c);
        return v == 'a'|| v == 'e' || v == 'i' || v == 'o' || v == 'u';
    }

    private void swap(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public String reverseVowels(String s) {
        if(s == null || s.length() == 0) {
            return s;
        }

        char[] c = s.toCharArray();
        int i = 0;
        int j = s.length()-1;

        while(i<j) {
            if (!isVowel(s.charAt(i))) {
                i++;
            }
            if (!isVowel(s.charAt(j))) {
                j--;
            }
            swap(c, i, j);
            i++;
            j--;
        }
        return String.valueOf(c);
    }

    public static void main(String args[]){
        ReverseVowels r = new ReverseVowels();
        String s = "leetcode";

        System.out.println(r.reverseVowels(s));
    }
}
