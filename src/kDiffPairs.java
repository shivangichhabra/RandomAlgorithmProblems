import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shivangi on 4/16/2017.
 */
public class kDiffPairs {
    public static void findPairs(int[] a, int diff){
        Map<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for(int i=0; i<a.length; i++){
            if(map.containsKey(diff+a[i])){
                int count = map.get(diff+a[i])-1;
                if(count == 0)
                    map.remove(diff+a[i]);
                else
                    map.put(diff+a[i], count);
                pairs++;
            }
            else{
                if(map.containsKey(a[i]))
                    map.put(a[i], map.get(a[i])+1);
                else
                    map.put(a[i],1);
            }
        }
        System.out.println(pairs);
    }

    /*
    this one
     */
    public static void findP(int[] a, int diff){
        if(a == null || a.length == 0 || diff < 0)
            return;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i: a)
            map.put(i, map.getOrDefault(i,0)+1);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(diff == 0){
                if(entry.getValue() >= 2)
                    count++;
            }
            else {
                if(map.containsKey(entry.getKey()+diff)){
                    count++;
                }
            }

        }
        System.out.println(count);
    }

    /*
    If we are not looking for distinct pairs
     */
    public static void find(int[] a, int diff){
        int count = 0;
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(Math.abs(a[i]-a[j]) == diff ) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]){
        int a[] = {3, 1, 4, 0, 5};
        int b[] = {1, 2, 3, 4, 5};
        int c[] = {1, 3, 1, 5, 4};

        find(a,2);
        find(b,1);
        find(c,0);
    }
}
