
public class SortColors {
    public void swap(int[] nums,int i,int j){
        while(i<j){
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
    
    public void sortColors(int[] nums) {
        int j=0, k = nums.length-1;
        for(int i=0; i<=k; i++){
            if(nums[i] == 0 && i != j)
                swap(nums, j++, i--);
            else if(nums[i] == 2 && i != k)
                swap(nums, i-- ,k--);
        }
    }
}
