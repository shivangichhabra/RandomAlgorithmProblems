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
            return num+multiplyOne(num+num, multiplier>>1);
    }


    public static void main(String args[]){
        MultiplyWithoutOperator m = new MultiplyWithoutOperator();
        System.out.println(m.multiplyOne(5,3));
        System.out.println(m.multiplyTwo(5,-3));
        System.out.println(m.multiplyThree(5,4));
    }
}
