/**
 * Created by shivangi on 3/26/17.
 */
public class ThirdLargestNum {

    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            if (nums[i] < max1 && nums[i] > max2){
                max3 = max2;
                max2 = nums[i];
            }
            if (nums[i] < max1 && nums[i] < max2 && nums[i] > max3){
                max3 = nums[i];
            }
        }
        return max3!=null ? max3 : max1;
    }
    public static void main(String args[]){
        ThirdLargestNum tm = new ThirdLargestNum();
        int a[] = {2,2,3,1};
        System.out.println(tm.thirdMax(a));

    }
}