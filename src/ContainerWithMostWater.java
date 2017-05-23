
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        if(height == null || height.length < 2)
            return 0;
        
        int max = 0;
        int start = 0;
        int end = height.length-1;
        while(start < end){
            max = Math.max(max, Math.min(height[start], height[end]) * (end-start) );
            if(height[start]< height[end])
                start++;
            else 
                end--;
        }
    
        return max;
    }
}
