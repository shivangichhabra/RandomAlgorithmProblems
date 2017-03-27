import java.util.Scanner;

/**
 * A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become .
 *
 * Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as a single line of space-separated integers.
 *
 * Sample Input:
 * n = 5
 * k = 4
 * input array = 1 2 3 4 5
 *
 * Sample Output:
 * output array = 5 1 2 3 4
 */
public class MoveLeft {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        /*
        O(nk)

        for(int j=0; j<k; j++) {
            for (int i = 0; i < a.length; i++) {
                int temp = a[a.length - 1];
                a[a.length - 1] = a[a.length - 1 - i];
                a[a.length - 1 - i] = temp;
            }
        }
        */

        //O(n)
        for(int i=0; i<n; i++){
            b[i] = a[(i+k)%n];
        }

        for(int i=0; i<a.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}
