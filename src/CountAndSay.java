/**
 * Created by Shivangi on 3/12/2017.
 */
public class CountAndSay {

    public static String getCount(int n){
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i=0; i<s.length(); i++){
            count++;
            if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
                sb.append(count).append(s.charAt(i));
                count = 0;
            }
        }
        return sb.toString();
    }


    public static void main(String args[]){
        int n = 1121111;
        System.out.println(getCount(n));
    }
}