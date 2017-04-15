/**
 * Created by Shivangi on 4/6/2017.
 */
public class OneAway {

    public boolean replace(String s1, String s2){
        boolean foundDiff = false;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i) && foundDiff)
                return false;
            foundDiff = true;
        }
        return true;
    }

    /*
    s1's length is more than s2
     */
    public boolean insertDelete(String s1, String s2){
        String temp = "";
        for(int i=0; i<s1.length(); i++){
            temp = s1.substring(0,i)+s1.substring(i+1);
            if(temp.equals(s2))
                return true;
        }
        return false;
    }

    public boolean checkEdit(String s1, String s2){
        if(s1.length() == s2.length()){
            return replace(s1,s2);
        } else if(s1.length()+1 == s2.length()){
            return insertDelete(s2,s1);
        } else if(s1.length()-1 == s2.length()){
            return insertDelete(s1,s2);
        }
        return false;
    }

    public static void main(String args[]){
        OneAway oa = new OneAway();
        System.out.println(oa.checkEdit("pale","ple"));
        System.out.println(oa.checkEdit("pales","pale"));
        System.out.println(oa.checkEdit("pale","bale"));
        System.out.println(oa.checkEdit("pale","bake"));
    }
}
