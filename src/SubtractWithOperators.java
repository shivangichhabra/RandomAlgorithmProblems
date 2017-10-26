/**
 * Created by Shivangi on 6/15/2017.
 */
public class SubtractWithOperators {

    public int subtract(int a, int b){
        while(b != 0){
            int carry = ~a & b;

            a = a^b;

            b = carry<<1;
        }
        return a;
    }

    public static void main(String args[]){
        SubtractWithOperators s = new SubtractWithOperators();
        System.out.println(s.subtract(18,3));
        System.out.println(s.subtract(18067,122));
        System.out.println(s.subtract(-18,30));
    }
}
