/**
 * Created by Shivangi on 4/11/2017.
 */
public class LongestNonCommonLength {

    public int length(String a, String b){
        if(a.equals(b))
            return 0;
        else
            return a.length() > b.length() ? a.length() : b.length();
    }

    public static void main(String args[]){
        LongestNonCommonLength l = new LongestNonCommonLength();
        l.length("aefawfawfawfaw", "aefawfeawfwafwaef");
    }
}
