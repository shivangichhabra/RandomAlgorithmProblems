import java.util.HashMap;

/**
 * Created by shivangi on 3/20/17.
 */
public class TwoSum {

    public void getSum1(int a[], int sum){
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] + a[j] == sum ){
                    System.out.println(i + " " + j);
                    System.out.println(a[i] + " " + a[j] );
                    return;
                }
            }
        }
        System.out.println("No such pair");
    }

    public void getSum2(int a[], int sum){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<a.length; i++){
            if(map.containsKey(sum-a[i])){
                System.out.println(map.get(sum-a[i]) + " " + i);
                System.out.println(a[map.get(sum-a[i])] + " " + a[i]);
                return;
            }
            map.put(a[i], i);
        }
        System.out.println("No such pair");
    }

    public int[] twoSumSortedArray(int[] nums, int target){
        int[] result = new int[2];
        if(nums.length < 2)
            return result;

        int start = 0, end = nums.length-1;

        while(start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return result;
    }
    
    public int[] twoSumArray(int[] numbers, int target){
        int[] result = new int[2];
        if(numbers.length < 2) {
            return new int[]{0, 0};
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            if(map.containsKey(target-numbers[i])){
                result[0] = map.get(target - numbers[i])+1;
                result[1] = i+1;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    /*
    this one
     */
    public void distinctPairs(int[] array, int sum){
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for(int i=0; i<array.length; i++){
            if(map.containsKey(sum - array[i])){
                int count = map.get(sum-array[i])-1;
                if(count == 0)
                    map.remove(sum-array[i]);
                else
                    map.put(sum-array[i], count);
                pairs++;
                System.out.println(sum-array[i]+ " "+ array[i]);
            }else{
                if(map.containsKey(array[i])) {
                    map.put(array[i],map.get(array[i]) +1);
                }else{
                    map.put(array[i], 1);
                }
            }
        }
        System.out.println(pairs);
    }


    public static void main(String args[]){
        TwoSum ts = new TwoSum();
        int a[] = {10,20,30, 40, 50, 50, 60, 50, 70, 30, 50};
        int sum = 100;

        int b[] = {1,2,3,4};
        int target = 6;

        ts.distinctPairs(a, sum);
        ts.twoSumSortedArray(b, target);
    }
}
