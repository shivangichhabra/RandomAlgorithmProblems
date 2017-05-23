import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDupsInArray {
	
	// when find a number i, flip the number at position i-1 to negative. 
    // if the number at position i-1 is already negative, i is the number that occurs twice.
	
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index] < 0)
                list.add(Math.abs(index+1));
            nums[index]= -nums[index];
        }
        return list;    
    }
}
