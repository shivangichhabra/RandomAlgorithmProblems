/**
 * Created by shivangi on 3/26/17.
 */
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target || nums[i] > target)
                return i;
        }
        return nums.length;
    }

    public static void main(String args[]){
        SearchInsert si = new SearchInsert();
        int a[] = {1};
        System.out.println(si.searchInsert(a, 2));
    }
}
