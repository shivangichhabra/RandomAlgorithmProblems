import java.math.BigInteger;

/**
 * Created by Shivangi on 3/8/2017.
 */
public class AddBinary {

    public static void BtoD(String num){
        int x = 0,  decimal = 0, binary = Integer.parseInt(num);
        while(binary > 0){
            int temp =  binary % 10;
            decimal += temp * (int)Math.pow(2,x);
            binary /= 10;
            x++;
        }
        System.out.println(decimal);
        System.out.println(Integer.parseInt(num,2));
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


    public static String addBinary(String a, String b) {
        return ((new BigInteger(a, 2)).add(new BigInteger(b, 2))).toString(2);
        //return Integer.toBinaryString((new BigInteger(a, 2)).add(new BigInteger(b, 2)));
    }

    public static void main(String args[]){
        BtoD("101");
        addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
    }
}
