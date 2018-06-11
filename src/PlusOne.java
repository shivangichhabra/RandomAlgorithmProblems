/**
 * Created by Shivangi on 3/28/2017.
 */
public class PlusOne {
    public static void main(String args[]){
        int digits[] = {1,2,3};
        plusOne(digits);

        for(int i=0; i<digits.length; i++)
            System.out.println(digits[i]);
    }

    public static int[] plusOne(int[] digits) {
        if(digits.length == 0 || digits == null )
            return new int[1];

        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }
        int[] newNum = new int[digits.length+1];
        newNum[0] = 1;
        return newNum;
    }
}
