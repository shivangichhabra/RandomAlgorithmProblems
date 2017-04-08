/**
 * Created by Shivangi on 3/8/2017.
 */
public class ReverseString {
    public static void main(String args[]){
        String s = "hello";
        String r = "";
        for(int i=s.length()-1; i>=0; i--){
            r += s.charAt(i);
        }
        System.out.println(r +"  "+ s);
    }
}
