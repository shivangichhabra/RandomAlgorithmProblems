import java.util.Scanner;

/**
 * John Watson performs an operation called a right circular rotation on an array of integers,
 * [a0, a1,...,an-1]. After performing one right circular rotation operation, the array is
 * transformed from [a0, a1,...,an-1] to [an-1, a0, a1...,an-2] .
 *
 * Watson performs this operation k times. To test Sherlock's ability to identify the current
 * element at a particular position in the rotated array, Watson asks  queries, where each
 * query consists of a single integer,m , for which you must print the element at index m in
 * the rotated array (i.e., the value of am).
 *
 * Sample Input:
 *  3 2 3
 *  1 2 3
 *  0
 *  1
 *  2
 *
 * Sample Output:
 *  2
 *  3
 *  1
 */

public class RotateArray {

    /*
    O(n) space
    O(n) time
     */
    public int[] rotate1(int[] a, int n, int k){
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[(i+k) % n ] = a[i];
        }
        return array;
    }

    public void rotate2(int[] a, int k){
        k %= a.length;
        reverse(a, 0, a.length-1);
        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
    }

    public void reverse(int[] a, int start, int end){
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end]   =  temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int k = 4; //in.nextInt();
        //int q = in.nextInt();
        int[] a = {1,2,3,4,5};//new int[n];
//
//        for(int i=0; i < n; i++){
//            a[i] = in.nextInt();
//        }
//
//        int[] array = ra.rotate1(a,n,k);

//        for(int a0 = 0; a0 < q; a0++){
//            int m = in.nextInt();
//            if(m < n){
//                System.out.println(array[m]);
//            }
//        }

        ra.rotate2(a, k);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
