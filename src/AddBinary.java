import java.math.BigInteger;

/**
 * Created by Shivangi on 3/29/2017.
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
    }

    public static String addBinary(String a, String b) {
        return ((new BigInteger(a, 2)).xor(new BigInteger(b, 2))).toString(2);
        //return Integer.toBinaryString((new BigInteger(a, 2)).add(new BigInteger(b, 2)));
    }

    public static void main(String args[]){
        BtoD("101");
        addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
    }
}
