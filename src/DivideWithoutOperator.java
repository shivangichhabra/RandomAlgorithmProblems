/**
 * Created by FS047207 on 6/14/2017.
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
        if(divisor == 0 || divisor == -1 || dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        int result = 0;
        while(dividend >= divisor){
            int numShift = 0;
            while(dividend >= (divisor<<numShift))
                numShift++;

            result += 1<<(numShift-1);
            dividend -= (divisor<<(numShift-1));
        }
        System.out.println("quotient: "+ result + "  reminder: " + dividend);
        return result;
    }

    public static void main(String args[]){
        DivideWithoutOperator d = new DivideWithoutOperator();
        //System.out.println(d.divideN(8,4));
        System.out.println(d.divideLogN(8,4));
    }
}
