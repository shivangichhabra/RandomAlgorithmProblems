import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shivangi on 3/28/2017.
 */
public class RemoveDuplicates {

    /*
    Using extra space
     */
    public int remove(int[] a){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<a.length; i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
            }
        }
        return set.size();
    }

    /*
    In place removal of dups
     */
    public int removeDups(int a[]){
        int x = 0;
        for(int i=1; i<a.length; i++)
            if(a[i] != a[i-1])
                a[++x] = a[i];
        return ++x;
    }

    public static void main(String args[]){
        RemoveDuplicates dup = new RemoveDuplicates();
        int a[] = {1,1,2,2,3};
        /*
        Length of remaining array
         */
        System.out.println(dup.remove(a));

        int len = dup.removeDups(a);
        for(int i=0; i<len; i++){
            System.out.print(a[i] + " ");
        }
    }
}
