/**
 * Created by Shivangi on 6/23/2017.
 */
public class isUgly {

    /*
    Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is
    not ugly since it includes another prime factor 7.
    Note that 1 is typically treated as an ugly number.
     */
    public boolean isUglyOne(int num) {
        if(num <=0)
            return false;

        int[] divisor = {2,3,5};

        for(int d : divisor){
            while(num%d == 0)
                num /= d;
        }

        return num==1;
    }

    public boolean isUglyTwo(int num) {
        if(num <= 0)
            return false;
        if(num == 1)
            return true;
        if(num%2 == 0)
            return isUglyTwo(num/2);
        if(num%3 == 0)
            return isUglyTwo(num/3);
        if(num%5 == 0)
            return isUglyTwo(num/5);
        return false;
    }

    public boolean isUglyThree(int num) {
        if(num <= 0)
            return false;
        if(num == 1)
            return true;
        int[] d = {2,3,5};
        for(int i : d){
            if(num%i == 0)
                return isUglyThree(num/i);
        }
        return false;
    }

    public static void main(String args[]){
        isUgly u = new isUgly();
        System.out.println(u.isUglyOne(14) + "  "  + u.isUglyOne(8));
        System.out.println(u.isUglyTwo(14) + "  "  + u.isUglyTwo(8));
        System.out.println(u.isUglyThree(14) + "  "  + u.isUglyThree(8));
    }
}
