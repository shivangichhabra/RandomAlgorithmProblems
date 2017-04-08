/**
 * Created by Shivangi on 3/28/2017.
 */
public class PlusOne {
    public static void main(String args[]){
        int digits[] = {1,2,3};
        int n = digits.length;
        for(int i=n-1; i >= 0; i--){
            if(digits[i] < 9)
                digits[i]++;
            else
                digits[i] = 0;
        }
    }
}
