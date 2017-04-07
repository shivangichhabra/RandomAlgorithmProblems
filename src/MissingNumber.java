/**
 * Created by Shivangi on 3/30/2017.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumExpected = (n * (n+1))/2;
        int sumExist = 0;
        for(int i=0; i<n; i++){
            sumExist += nums[i];
        }
        return sumExpected-sumExist;
    }

    public int missingNumberXOR(int[] nums) {
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            n ^= i;
            n ^= nums[i];
        }
        return n;
    }

    public static void main(String args[]){
        MissingNumber ma = new MissingNumber();
        int[] a = {0,1,3};
        System.out.println(ma.missingNumber(a));
        System.out.println(ma.missingNumberXOR(a));
    }
}
