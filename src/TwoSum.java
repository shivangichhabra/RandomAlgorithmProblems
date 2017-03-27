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

    public static void main(String args[]){
        TwoSum ts = new TwoSum();
        int a[] = {10,20,30, 40, 50, 50, 60, 50};
        int sum = 100;

        ts.getSum1(a, sum);
        ts.getSum2(a, sum);
    }
}
