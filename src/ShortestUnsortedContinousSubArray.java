import java.util.Arrays;
import java.util.List;

/**
 * Created by Shivangi on 6/24/2017.
 */
public class ShortestUnsortedContinousSubArray {

    public int findUnsortedSubarrayOne(int[] nums) {
        int n = nums.length;

        int[] temp = nums.clone();
        Arrays.sort(temp);

        int start = 0, end = n-1;

        while(start < n && temp[start] == nums[start])
            start++;

        while(end > start && temp[end] == nums[end])
            end--;

        return end-start+1;
    }

    public int findUnsortedSubarrayTwo(int[] nums) {
        int n = nums.length, start = -1, end = -2, max = nums[0], min = nums[n-1];

        for(int i=0; i<n; i++){
            min = Math.min(min, nums[n-i-1]);
            if(min < nums[n-i-1])
                start = n-i-1;

            max = Math.max(max, nums[i]);
            if(max > nums[i])
                end = i;
        }

        return end-start+1;
    }

    public static void main(String args[]){
        ShortestUnsortedContinousSubArray s = new ShortestUnsortedContinousSubArray();

        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(s.findUnsortedSubarrayOne(nums));
        System.out.println(s.findUnsortedSubarrayTwo(nums));
    }

}
