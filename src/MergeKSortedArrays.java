import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by FS047207 on 6/15/2017.
 */
public class MergeKSortedArrays {

    class ArrayContainer implements  Comparable<ArrayContainer>{

        int[] arr; int index;

        public ArrayContainer(int[] a, int i){
            arr = a;
            index = i;
        }

        @Override
        public int compareTo(ArrayContainer a) {
            return this.arr[this.index] - a.arr[a.index];
        }
    }

    public int[] mergeArrays(int[][] arr) {

        PriorityQueue<ArrayContainer>  minHeap = new PriorityQueue<>();
        int size = 0;

        for(int i = 0; i<arr.length; i++){
            minHeap.add(new ArrayContainer(arr[i], 0));
            size += arr[i].length;
        }

        int[] output = new int[size];

        int counter = 0;
        while (!minHeap.isEmpty()){
            ArrayContainer a =  minHeap.poll();
            output[counter++] = a.arr[a.index];

            if(a.index < a.arr.length-1)
                minHeap.add(new ArrayContainer(a.arr, a.index+1));
        }

        return output;
    }

    public static void main(String args[]){
        MergeKSortedArrays mk = new MergeKSortedArrays();

        int[][] arr = {{ 1, 3, 5, 7 },
                       { 2, 4, 6, 8 },
                       { 0, 9, 10, 11 }};

        int[] result = mk.mergeArrays(arr);
        System.out.println(Arrays.toString(result));
    }


}
