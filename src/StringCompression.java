/**
 * Created by Shivangi on 4/6/2017.
 */
public class StringCompression {

    /*
    int count = 0
    if char.at(i) == char.at(i+1) and  i != length-1{
        count++;
     }

     */
    public String compress(String s){
        int count = 0;
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            count++;
            if( i+1 >= s.length()  || s.charAt(i) != s.charAt(i+1) ){
                str.append(s.charAt(i)).append(count);
                count = 0;
            }

        }
       return str.toString().length() > s.length() ? s : str.toString();
    }

    public static void main(String args[]){
        StringCompression sc = new StringCompression();
        System.out.println(sc.compress("aabbbbccaaaaddddd"));
        System.out.println(sc.compress("abcd"));
    }
}
