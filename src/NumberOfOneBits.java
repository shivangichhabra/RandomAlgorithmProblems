/**
 * Created by Shivangi on 6/23/2017.
 */
public class NumberOfOneBits {

    public void countBits(int n) { //unsigned int
        int count = 0;
        for(int i=0; i<32; i++){
            if((n&1) == 1)
                count++;
            n = n>>1;
        }
        System.out.println(count);
    }

    public static void main(String args[]){
        NumberOfOneBits nb = new NumberOfOneBits();
        nb.countBits(60);
    }
}
