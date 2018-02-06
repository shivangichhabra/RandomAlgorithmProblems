/**
 *
 * A child is running up a staircase with n steps and can hop either 1 step, 2
 * steps, or 3 steps at a time. Implement a method to count how many possible
 * ways the child can run up the stairs.
 *
 */
public class TripleStep {

    //top down approach complexity O(3^n)
    public int countWays(int n){
        if(n < 0)
            return 0;
        else if(n == 0)
            return 1;
        else
            return countWays(n-1)+countWays(n-2)+countWays(n-3);
    }

    //bottom up approach complexity O(n)
    public int countWaysON(int n){
        if(n<0)
            return 0;
        if(n == 0)
            return 1;
        if(n == 1)
            return 2;
        if(n == 2)
            return 4;
        int[] result = new int[n];
        result[0] = 1;  // 1
        result[1] = 2;  // 2 1's // 2
        result[2] = 4;  // 3 1's // 2+1 // 1+2 // 3
        for(int i=3; i<n; i++){
            result[i] = result[i-1]+result[i-2]+result[i-3];
        }
        return result[n-1];
    }



    public static void main(String args[]){
        TripleStep t = new TripleStep();
        System.out.println(t.countWays(3));
        System.out.println(t.countWaysON(3));
    }
}
