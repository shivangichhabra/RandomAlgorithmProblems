/**
 * Created by keepi on 6/21/2017.
 */
public class StudentRecord {

    public static boolean isValid(String s){
        return (s.indexOf("A") == s.lastIndexOf("A") && !s.contains("LLL"));
    }


    public static void main(String args[]){
        String s = "PPALLA";
        System.out.println(isValid(s));
    }
}
