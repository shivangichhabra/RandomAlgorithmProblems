
public class OptimalDivision {
    public String optimalDivisionOne(int[] nums) {
        StringBuilder result = new StringBuilder();
        if(nums.length <1)
            return "";

        result.append(nums[0]);
        for(int i=1; i< nums.length; i++){
            if(i==1 && nums.length >2)
                result.append("/(").append(nums[i]);
            else
                result.append("/").append(nums[i]);
        }

        return nums.length>2 ? result.append(")").toString() : result.toString();
    }
    
    public String optimalDivisionTwo(int[] nums) {

        if(nums.length == 1)
            return nums[0] + "";
            
        if(nums.length == 2)
            return nums[0] + "/" + nums[1];
            
        String result = nums[0] + "/(" + nums[1];
        for(int i=2; i<nums.length; i++)
            result += "/"+nums[i];
            
        return result + ")";
    }
}
