/**
 * Created by Shivangi on 6/23/2017.
 */
public class FactorialTrailingZeros {

    public int trailingZeroes(int n) {
        return n==0 ? 0 : (n/5 + trailingZeroes(n/5));
    }

    public static void main(String args[]){
        FactorialTrailingZeros ft = new FactorialTrailingZeros();
        System.out.println(ft.trailingZeroes(1673020000));
    }

}
