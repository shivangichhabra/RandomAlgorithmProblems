import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Shivangi on 3/30/2017.
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

    public boolean ContainsDups(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(i - map.get(nums[i])) <=  k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String args[]){
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] a ={1,2,3,4,1};
        System.out.println(cd.containsDuplicate(a));
        int[] b = {1,0,1,1};
        System.out.println(cd.ContainsDups(b, 0));
    }
}
