/**
 * Created by FS047207 on 6/14/2017.
 */
public class MultiplyWithoutOperator {

    /*
    Given a and b, these have complexity O(b)
     */
    public int multiplyOne(int num, int multiplier){
        if(multiplier == 0)
            return 0;

        if(num >= Integer.MAX_VALUE || multiplier >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        int result = 0;
        for(int i=0; i<multiplier; i++){
            result += num;
        }

        return result;
    }

    public int multiplyTwo(int num, int multiplier){
        if(multiplier == 0)
            return 0;

        if(multiplier > 0)
            return  num + multiplyTwo(num, multiplier-1);

        if(multiplier < 0);
            return -multiplyTwo(num,-multiplier);
    }

    /*
    Given a and b, this has complexity O(logb)
     */
    public int multiplyThree(int num, int multiplier){
        if(num == 0 || multiplier == 0)
            return 0;

        if(multiplier == 1)
            return num;

        if(multiplier%2 == 0)
            return multiplyThree(num+num, multiplier>>1);
        else
            return num+multiplyThree(num+num, multiplier>>1);
    }

    public int multiply(int multiple, int multiplier) {
        if (multiplier == 0)
            return 0;

        if (multiple == Integer.MIN_VALUE && multiplier == -1)
            return Integer.MAX_VALUE;

        if (multiple == Integer.MAX_VALUE && multiplier == -1)
            return Integer.MIN_VALUE;

        if (multiple == Integer.MAX_VALUE && multiplier > 0 ||  multiple > 0 && multiplier == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (multiplier == 1)
            return multiple;

        if (multiplier == -1)
            return -multiple;

        if (multiplier == 2)
            return (multiple << 1);

        long x = multiple;
        long y = multiplier;

        int sign = (x < 0 ^ y < 0) ? -1 : 1;

        x = Math.abs(x);
        y = Math.abs(y);

        return sign * (int) (Math.ceil(Math.exp(Math.log(x) + Math.log(y))));
    }


    public static void main(String args[]){
        MultiplyWithoutOperator m = new MultiplyWithoutOperator();
        System.out.println(m.multiplyOne(5,3));
        System.out.println(m.multiplyTwo(5,-3));
        System.out.println(m.multiplyThree(5,4));
    }
}
