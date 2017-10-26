/**
 * Created by Shivangi on 6/21/2017.
 */
public class ReverseBits {

    public void getBits(int n){
        StringBuilder binary = new StringBuilder();

        while(n > 0){
            binary.append(n%2 == 0 ? "0" : "1");
            n = n/2;
        }
        System.out.println(Integer.parseUnsignedInt(binary.toString(), 2));
    }

    public int reverseBits(int n) {
        if(n == 0)
            return 0;

        int result = 0;
        for(int i=0; i<32; i++){
            result <<= 1;
            if((n&1) == 1) {
                result++;
            }
            n >>= 1;
        }
        return result;
    }

    public static void main(String args[]){
        ReverseBits rb = new ReverseBits();
        rb.getBits(43261596);

        System.out.println(rb.reverseBits(43261596));
        }
}
