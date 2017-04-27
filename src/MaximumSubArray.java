/**
 * Created by Shivangi on 4/16/2017.
 */
public class MaximumSubArray {


    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int a[] = new int[nums.length];
        a[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            a[i] = nums[i] + (a[i-1] > 0 ? a[i-1] : 0) ;
            sum = Math.max(sum, a[i]);
        }
        return sum;
    }

    public int maxWithDP(int[] nums){
        int sum = 0;
        int res = nums[0];
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            res = Math.max(sum, res);
            sum = Math.max(0, sum);
        }
        return res;
    }

    public static void main(String args[]){
        MaximumSubArray m = new MaximumSubArray();
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        int[] b = {1};
        int c[] = {-2, -1};
        System.out.println(m.maxSubArray(a));
        System.out.println(m.maxWithDP(c));
    }
}
