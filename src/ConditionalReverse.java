/**
 * Created by Shivangi on 3/12/2017.
 */
public class ConditionalReverse {
    public String reverseStr(String s, int k) {

        char[] chars = s.toCharArray();
        for(int i=0; i<s.length(); i += 2*k ){
            swap(chars, i, i+k);
        }
        return String.valueOf(chars);
    }

    public void swap(char[] c, int i, int j){
        j = Math.min(c.length, j)-1;
        while(i<j){
            char temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
    }
    public static void main(String args[]){
        ConditionalReverse r = new ConditionalReverse();
        String s = "abcdefg"; //bacdfeg
        int k = 2;
        System.out.println(r.reverseStr(s,k));
    }
}
