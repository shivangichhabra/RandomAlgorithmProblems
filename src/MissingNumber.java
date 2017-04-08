/**
 * Created by shivangi on 3/27/17.
 */
public class MissingNumber {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = nums[(i + k) % n];
        }
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String args[]){
        int a[] = {1,2,3};
        int k = 1;
        rotate(a,k);
    }
}
