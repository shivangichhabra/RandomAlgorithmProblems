/**
 * Created by Shivangi on 6/21/2017.
 */
public class AlternateHouseRobberer {
    public int robOne(int[] nums) {

        int even=0, odd=0;
        for(int i=0; i<nums.length; i++){
            if(i%2 == 0)
                even = Math.max(even+nums[i], odd);
            else
                odd = Math.max(odd+nums[i], even);
        }
        return Math.max(even, odd);
    }

    public int robTwo(int[] nums) {

        int include = 0, not = 0;
        for(int i=0; i<nums.length; i++){
            int temp = not;
            not = Math.max(include, not);
            include = nums[i] + temp;
        }

        return Math.max(include, not);
    }
    
    public static void main(String args[]){
        AlternateHouseRobberer r = new AlternateHouseRobberer();
        int[] a = {1,4,29,10,19,100,12};
        System.out.println(r.robOne(a));
        System.out.println(r.robTwo(a));
    }

}
