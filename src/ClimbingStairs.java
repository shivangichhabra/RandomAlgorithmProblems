/**
 * Created by Shivangi on 6/23/2017.
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;

        int[] A = new int[n];
        A[0] = 1;
        A[1] = 2;
        for(int i = 2; i<n; i++)
        {
            A[i] = A[i-1] + A[i-2];
        }

        return A[n-1];
    }

    public static void main(String args[]){
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(10));
    }

}
