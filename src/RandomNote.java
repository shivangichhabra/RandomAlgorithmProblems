/**
 * Created by Shivangi on 3/7/2017.
 */
public class RandomNote {

    public static boolean isValid(String r, String s){
        int hash[] = new int[128];
        for(int i=0; i<s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        for(int i=0; i<r.length(); i++){
            if(--hash[r.charAt(i)] < 0 ){
                    return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(isValid("aa","ab"));
    }
}
