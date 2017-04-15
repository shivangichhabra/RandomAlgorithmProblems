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

    public void distinctPairs(int[] array, int sum){
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


    public static void main(String args[]){
        TwoSum ts = new TwoSum();
        int a[] = {10,20,30, 40, 50, 50, 60, 50};
        int sum = 100;

        ts.getSum1(a, sum);
        ts.getSum2(a, sum);
    }
}
