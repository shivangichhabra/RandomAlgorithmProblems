/**
 * Created by Shivangi on 4/6/2017.
 */
public class StringRotation {

    /*
    Check if s2 is rotation of s1;
     */
    public boolean isRotation(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        return isSubString(s2+s2,s1);
    }

    public boolean isSubString(String s1, String s2){
        if(s1.contains(s2))
            return true;
        return false;
    }

    public static void main(String args[]){
        StringRotation sr = new StringRotation();

        System.out.println(sr.isRotation("waterbottle", "erbottlewat"));
    }
}
