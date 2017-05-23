/**
 * Created by Shivangi on 3/12/2017.
 */
public class Substring {

    public boolean substr(String s){
        int l = s.length();
        for(int i = l/2; i>0; i--){
            if( l%i == 0){
                String sub = s.substring(0,i);
                int j = i;
                while(j<l) {
                    if (!s.substring(j, j+i).equals(sub))
                        break;
                    else
                        j += i;
                }
                if(j == l)
                    return true;
            }
        }
        return false;
    }

    public boolean repeatedSubstringPattern(String s){
        int l = s.length();
        for(int i = (l+1)/2; i < l; i++){
            if(l % (l-i) == 0){
                String prefix = s.substring(0,i);
                String rem = s.substring(i);
                String suffix = s.substring(l-i);
                if(s.startsWith(rem) && suffix.equals(prefix))
                    return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        String s = "abcabc";
        System.out.println(new Substring().substr(s));
        System.out.println(new Substring().repeatedSubstringPattern(s));
    }
}
