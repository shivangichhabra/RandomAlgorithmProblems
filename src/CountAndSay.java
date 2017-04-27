/**
 * Created by Shivangi on 3/12/2017.
 */
public class CountAndSay {

    public String getCount(int n){
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

    public String getCountAndSay(int n) {
        StringBuilder curr = new StringBuilder("1");
        StringBuilder prev;
        int count;
        char say;
        for(int i=1; i<n; i++){
            prev = curr;
            curr = new StringBuilder();
            count = 1;
            say = prev.charAt(0);

            for(int j=1, len= prev.length(); j<len; j++){
                if(prev.charAt(j) != say){
                    curr.append(count).append(say);
                    count = 1;
                    say = prev.charAt(j);
                }
                else
                    count++;
            }
            curr.append(count).append(say);
        }
        return curr.toString();
    }

    public static void main(String args[]){
        CountAndSay c = new CountAndSay();
        int n = 1121111;
        System.out.println(c.getCount(n));
        int m = 0;
        System.out.println(c.getCountAndSay(m));
    }
}