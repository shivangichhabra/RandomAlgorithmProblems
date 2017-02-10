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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];

        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }

        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[(i+k) % n ] = a[i];
        }

        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            if(m < n){
                System.out.println(array[m]);
            }
        }
    }
}
