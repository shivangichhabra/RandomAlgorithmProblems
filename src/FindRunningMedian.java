import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by Shivangi on 6/6/2017.
 */
public class FindRunningMedian {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public FindRunningMedian(){
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num){
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());

        if(maxHeap.size() < minHeap.size())
            maxHeap.offer(minHeap.poll());
    }

    public double findMedian(){
        if(maxHeap.size() == minHeap.size())
            return (double)(maxHeap.peek() + minHeap.peek())/2;
        else
            return maxHeap.peek();
    }

    public static void main(String args[]){
        FindRunningMedian frm = new FindRunningMedian();
        int[] a = {12,4,5,3,8,7,1};

        for(int i=0; i<a.length; i++){
            frm.addNum(a[i]);
            System.out.println(frm.findMedian());
        }
    }
}
