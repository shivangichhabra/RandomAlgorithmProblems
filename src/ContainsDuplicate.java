import java.util.HashSet;
import java.util.Set;

/**
 * Created by FS047207 on 3/30/2017.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String args[]){
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] a ={1,2,3,4,1};
        System.out.println(cd.containsDuplicate(a));
    }
}
