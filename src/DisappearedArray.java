import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shivangi on 4/16/2017.
 */
public class DisappearedArray {

    public static  List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            while(nums[i] != i+1 && nums[i] != nums[nums[i]-1]){
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
        }

        for(int i=0; i<nums.length; i++) {
            if (nums[i] != i+1) {
                missing.add(i + 1);
            }
        }
        return missing;
    }

    public static void main(String args[]){
        int[] a = {4,3,2,7,8,2,3,1};
        List<Integer> output = findDisappearedNumbers(a);
    }
}
