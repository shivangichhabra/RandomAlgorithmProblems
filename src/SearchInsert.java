/**
 * Created by shivangi on 3/26/17.
 */
public class SearchInsert {

    /*
    O(n)
     */
    public int searchAndInsertON(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target || nums[i] > target)
                return i;
        }
        return nums.length;
    }

    /*
    log(n)
     */
    public int searchAndInsertLOGN(int[] nums, int target) {
        if(nums == null)
            return -1;

        if(target > nums[nums.length-1])
            return nums.length;

        int i = 0;
        int j = nums.length-1;

        while(i<j){
            int mid = (i+j)/2;
            if(target > nums[mid]){
                i = mid+1;
            } else {
                j = mid;
            }
        }
        return j;
    }

    /*
    O(log(n))
     */
    public int searchAndInsertLOGNAgain(int[] nums, int target) {
        if(nums == null)
            return -1;

        if(target > nums[nums.length-1])
            return nums.length;

        int i = 0;
        int j = nums.length-1;

        while(i<j) {
            int mid = (i + j) / 2;
            if(target > nums[mid]){
                i = mid+1;
            } else if(target > nums[mid]){
                j = mid-1;
            } else {
                return mid;
            }
        }
        return i;
    }

    public static void main(String args[]){
        SearchInsert si = new SearchInsert();
        int a[] = {1,3,6,7,9};
        System.out.println(si.searchAndInsertON(a, 10));
        System.out.println(si.searchAndInsertLOGN(a, 10));
    }
}
