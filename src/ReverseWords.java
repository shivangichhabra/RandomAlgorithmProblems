import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Shivangi on 3/12/2017.
 */
public class ReverseWords {

    /*
    Reverse the order of String not words
    Space O(n)
    Time O(n)
     */
    public String reverseWords(String s){
        if(s.length() == 0)
            return "";
        StringBuilder builder = new StringBuilder();
        String str[] = s.split("\\s");
        for(int i=str.length-1; i>=0; i--){
            builder.append(str[i] + " ");
        }
        return builder.toString().trim();
    }

    /*
    Reverse the order of String not words
    Space O(n)
    Time O(n)
     */
    public String reverseInplace(String s){
        if(s.length() == 0)
            return "";
        String words[] = s.split("\\s");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    /*
    Reverse the word in place
    Space O(n)
    Time O(n)
     */
    public String reverseCharsInWord(String s){
        StringBuilder output = new StringBuilder();
        String[] words = s.split("\\s");
        for(String w: words){
            output.append(new StringBuilder(w).reverse() + " ");
        }
        return output.toString().trim();
    }


    /*
    Swaps chars
     */
    public void swap(char[] c, int i, int j){
        while(i<j){
            char temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
    }

    /*
    Reverse the order of String not words
    Space O(1)
    Time O(n)
     */
    public String reverseOrderNoExtraSpace(String s){
        char[] sentence = s.toCharArray();

        //Reverse the whole String
        swap(sentence, 0, sentence.length-1);

        //Reverse the words in space
        int wordCount = 0;
        for(int i=0; i<sentence.length; i++){
            if(sentence[i] == ' ') {
                swap(sentence, wordCount, i - 1);
                wordCount = i+1;
            }
        }
        //swap the last word
        swap(sentence, wordCount, sentence.length-1);
        return String.valueOf(sentence);
    }

    /*
    Reverse the order of String not words
    Time O(n)
    */
    public String reverseOrderNoExtraSpace2(String s) {
        String sentence = "";
        StringBuilder word = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                sentence = s.charAt(i)+word.toString()+sentence;
                word = new StringBuilder();
            }
            else {
                word.append(s.charAt(i));
            }
        }
        return word+sentence;
    }

    public static void main(String args[]){
        ReverseWords rw = new ReverseWords();
        String s = "Let's do  this";
        System.out.println(rw.reverseWords(s));
        System.out.println(rw.reverseInplace(s));
        System.out.println(rw.reverseCharsInWord(s));
        System.out.println(rw.reverseOrderNoExtraSpace(s));
        System.out.println(rw.reverseOrderNoExtraSpace2(s));
    }
}
