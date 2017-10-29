import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by Shivangi on 6/15/2017.
 */
public class KthSmallestElementInArray {

    public int getKthSmallestWithSort(int[] nums, int k){
        Arrays.sort(nums);
        return nums[k-1]; //if largest was needed nums[nums.length-k]
    }

    public int getKthSmallestWithHeap(int[] nums, int k){
        //max heap
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:nums){
            heap.offer(i);

            if(heap.size() > k) {
                heap.poll();
               // System.out.println(heap.peek());
            }
        }
        return heap.peek();
    }

    public void swap(int[] nums, int n1, int n2) {
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }

    public static void main(String args[]){
        KthSmallestElementInArray k = new KthSmallestElementInArray();
        int[] nums = {3,2,6,8,1,0,19,35,67,10};

        System.out.println(k.getKthSmallestWithSort(nums, 4));
        System.out.println(k.getKthSmallestWithHeap(nums, 4));
    }
}
