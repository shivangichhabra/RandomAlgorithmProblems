/**
 * Created by Shivangi on 3/9/2017.
 */
public class Match {
    public static void main(String args[]){
        String s1 = "aple banana kiwi rose";
        String s2 = "ki";
        System.out.println(s1.contains(s2) ? s1.indexOf(s2) : -1);
    }
}
