/**
 * Created by FS047207 on 6/21/2017.
 */
public class PowerOfThree {

    public boolean powerOfThreeOne(int n){
        while(n > 0 && n%3 == 0)
                n /= 3;
        return n==1;
    }

    public boolean powerOfThreeTwo(int n){
       int maxOfThree = (int) Math.pow(3,19);
        return n>0 && maxOfThree%n == 0;
    }

    public static void main(String args[]){
        PowerOfThree pt = new PowerOfThree();
        System.out.println(pt.powerOfThreeOne(15));
        System.out.println(pt.powerOfThreeTwo(234));
    }
}
