import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Shivangi on 4/16/2017.
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than
 * (n/2) times. (assume that the array is non-empty and the majority element always exist in the array.)
 */
public class MajorityElement {

    public int getElement(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++){
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
            if(map.get(a[i]) > a.length/2){
                return a[i];
            }
        }
        return -1;
    }

    public static void main(String args[]){
        MajorityElement me = new MajorityElement();
        int []a = {1,2,3,5,2,3,2,2,2,2,2};
        System.out.println(me.getElement(a));
    }
}
