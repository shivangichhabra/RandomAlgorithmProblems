import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by FS047207 on 4/10/2017.
 */
public class DistinctTwoSumPairs {

    public void pairs(int[] array, int sum){
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for(int i=0; i<array.length; i++){
            if(map.containsKey(sum - array[i])){
                int count = map.get(sum-array[i])-1;
                if(count == 0)
                    map.remove(sum-array[i]);
                else
                    map.put(array[i], count);
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


    public void uniquePairs(int[] array, int sum){
        Set<Integer> set = new HashSet<>();

        for(int n : array){
            if(!set.contains(sum-n))
                set.add(n);
              else
            System.out.println(n + "  " + (sum-n));
        }

    }

    public static void main(String args[]){
        DistinctTwoSumPairs dtp = new DistinctTwoSumPairs();
        int[] array = {10, 50, 50, 50, 60, 40, 70, 30, 50, 50};
        int sum = 100;
        dtp.pairs(array, sum);
    }
}
