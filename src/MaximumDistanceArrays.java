import java.util.List;

/**
 * Created by keepi on 6/24/2017.
 */
public class MaximumDistanceArrays {
    public int maxDistance(List<List<Integer>> arrays) {
        int result = Integer.MIN_VALUE;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);

        for(int i=1; i<arrays.size(); i++){
            int head = arrays.get(i).get(0);
            int tail = arrays.get(i).get(arrays.get(i).size()-1);

            result = Math.max(Math.abs(max-head), result);
            result = Math.max(Math.abs(tail-min), result);

            min = Math.min(min, head);
            max = Math.max(max, tail);
        }

        return result;
    }
}
