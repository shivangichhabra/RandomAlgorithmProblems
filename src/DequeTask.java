import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

/**
 * In computer science, a double-ended queue (dequeue, often abbreviated to deque,
 * pronounced deck) is an abstract data type that generalizes a queue, for which
 * elements can be added to or removed from either the front (head) or back (tail).
 *
 * n this problem, you are given N integers. You need to find the maximum number of
 * unique integers among all the possible contiguous subarrays of size M.
 *
 * Note: Time limit is 3 second for this problem.
 *
 * Sample Input:
 *  6 3
 *  5 3 5 2 3 2
 *
 * Sample Output:
 *  3
 */
public class DequeTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);

            if(deque.size() == m){
                if(set.size() > max )
                    max = set.size();
                int first = deque.remove();
                if(!deque.contains(first))
                    set.remove(first);
            }
        }
        System.out.println(max);
    }
}
