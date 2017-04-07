import java.math.BigInteger;

/**
 * Created by Shivangi on 3/8/2017.
 */
public class AddBinary {

    public static void IntToB(String n){
        System.out.println(Integer.parseInt(n,2));
    }

    public static void BtoD(String num){
        int pow = 0;
        int decimal = 0;
        int n = Integer.parseInt(num);

        while(n > 0){
            int temp  = n % 10;
            decimal += temp*(Math.pow(2,pow++));
            n/= 10;
        }
        System.out.println(decimal);
    }

    public static String DtoB(int n){
        StringBuilder s = new StringBuilder("");
        if(n < 0)
            return "0";

        while(n > 0) {
            s.append(n%2);
            n /= 2;
        }
        return s.reverse().toString();
    }

    public static void IntToB(int n){
        System.out.println(Integer.toBinaryString(n));
    }

    public static String AddBinary(String a , String b){

        BigInteger first = new BigInteger(a,2);
        BigInteger second = new BigInteger(b, 2);
        BigInteger sum = first.add(second);
        return sum.toString(2);



    }

    public static void main(String args[]){
        int n = 13;
        System.out.println(DtoB(n));
        IntToB(n);

        String num = "1101";
        IntToB(num);
        BtoD(num);

        System.out.println(AddBinary("11","1"));

        System.out.println(AddBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}
