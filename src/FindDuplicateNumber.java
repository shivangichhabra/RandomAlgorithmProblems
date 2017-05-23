import java.util.Arrays;

public class FindDuplicateNumber {
	public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                System.out.println(nums[i]);
                return nums[i];
            }
        }
        return -1;
    }
}
