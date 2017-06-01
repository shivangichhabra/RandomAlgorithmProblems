import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length < 3)
            return result;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(i==0 || nums[i] > nums[i-1]) { //avoids repeatition
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end) {
                    if (nums[i] + nums[start] + nums[end] == 0){ //target = 0
                        result.add(Arrays.asList(nums[i], nums[start],  nums[end]));
                        start++;
                        end--;
                        
                        while(start < end && nums[start] == nums[start-1])
                            start++;

                        while(start < end && nums[end] == nums[end+1])
                            end--;

                    } else if(nums[i] + nums[start] + nums[end] < 0)
                        start++;
                    else
                        end--;
                }
            }
        }
        return result;
    }
}
