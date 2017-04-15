/**
 * Created by FS047207 on 4/11/2017.
 */
public class ReverseCharsInWords {

    public String reverse(String s){
        StringBuilder output = new StringBuilder();
        String[] words = s.split("\\s");
        for(String w: words){
            output.append(new StringBuilder(w).reverse() + " ");
        }
        return output.toString().trim();
    }
    public static void main(String args[]){
        ReverseCharsInWords rc = new ReverseCharsInWords();
        System.out.println(rc.reverse("let's do this thing!" +
                ""));
    }
}
