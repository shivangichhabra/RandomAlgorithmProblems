import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Shivangi on 4/16/2017.
 */
public class MajorityElement {

    public static void count(int[] a){
        Arrays.sort(a);

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int elementCount = 0;
        for(int i=0; i<a.length; i++){
            elementCount++;
            if(i+1 >= a.length || a[i] != a[i+1]){
                count = count < elementCount ? elementCount : count;
                map.put(elementCount, a[i]);
                elementCount = 0;
            }
        }
        System.out.println(map.get(count));
    }

    public static void main(String args[]){
        int []a = {1,2,3,1,2,4,5,2};
        count(a);
    }
}
