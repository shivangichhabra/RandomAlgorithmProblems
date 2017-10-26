/**
 * Created by Shivangi on 6/14/2017.
 */
public class DivideWithoutOperator {

    /*
    works well in case of completely divisible numbers
    gives approx result(floor) in case of not exactly divisble
     */
    public int divideN(int dividend, int divisor){
        if(divisor == 0 || divisor == -1 || dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        if(dividend < divisor)
            return 0;

        int result = 0; //quotient
        while (dividend >= divisor){
            dividend -= divisor;
            result++;
        }
        return result;
    }

    /*
    log(N)
     */
    public int divideLogN(int dividend, int divisor){
        int neg = 1;
        if(dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0)
            neg = -1;

        if(divisor == 0)
            return Integer.MAX_VALUE;

        if(divisor == 1)
            return dividend;

        int result = 0;
        while(dividend >= divisor){
            int numShift = 0;
            while(dividend >= (divisor<<numShift))
                numShift++;

            result += 1<<(numShift-1);
            dividend -= (divisor<<(numShift-1));
        }
        System.out.println("quotient: "+ result + "  reminder: " + dividend);
        return result*neg;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0)
            return Integer.MAX_VALUE;

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        if (dividend == divisor)
            return 1;

        if (divisor == 1)
            return dividend;

        if (divisor == -1)
            return -dividend;

        if (divisor == 2)
            return (dividend >> 1);

        long x = dividend;
        long y = divisor;

        int sign = (x < 0 ^ y < 0) ? -1 : 1;

        x = Math.abs(x);
        y = Math.abs(y);

        return sign * (int) (Math.floor(Math.exp(Math.log(x) - Math.log(y))));
    }

    public static void main(String args[]){
        DivideWithoutOperator d = new DivideWithoutOperator();
        System.out.println(d.divideLogN(8,4));
    }
}
