/**
 * Given an array, reverse it.
 *
 * Sample Input:
 *  [1,2,3,4,5,6,7]
 *
 * Sample Output:
 *  [7,6,5,4,3,2,1]
 */
public class ReverseArray {

    public void reverse(int array[]){
        int len = array.length;
        for(int i=0; i<len/2; i++){
            int temp = array[i];
            array[i] = array[len-i-1];
            array[len-i-1] = temp;
        }
    }

    public void print(int[] array){
        System.out.println();
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] +"  ");
        }
    }

    public static void main(String args[]){
        ReverseArray ra = new ReverseArray();
        int array[] = {1,2,3,4,5,6,7};
        ra.print(array);
        ra.reverse(array);
        ra.print(array);

    }
}
