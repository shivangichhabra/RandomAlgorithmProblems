/**
 * Created by Shivangi on 6/23/2017.
 */
public class Sqrt {

    //best solution
    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;

        while(start <= end){
            int mid = (start+end)/2;

            if(mid == x/mid)
                return mid;
            else if(mid < x/mid){
                start = mid+1;
            }
            else
                end = mid-1;
        }
        return end;
    }

    public static int floorSqrt(int x)
    {
        // Base Cases
        if (x == 0 || x == 1)
            return x;

        // Do Binary Search for floor(sqrt(x))
        int start = 1, end = x, ans=0;
        while (start <= end)
        {
            int mid = (start + end) / 2;

            // If x is a perfect square
            if (mid*mid == x)
                return mid;

            // Since we need floor, we update answer when mid*mid is
            // smaller than x, and move closer to sqrt(x)
            if (mid*mid < x)
            {
                start = mid + 1;
                ans = mid;
            }
            else   // If mid*mid is greater than x
                end = mid - 1;
        }
        return ans;
    }

    public int mySqrtRut(int x)
    {
        if(x == 0)
            return 0;

        int number = 0;
        int i = 1;

        while(!((number + i -1) * (number + i - 1) < x && ((number +
                i) * (number + i) >= x || (number + i) * (number + i) <= 0)))
        {
            if(((number + i * 2 -1) * (number + i * 2 - 1) >= x) ||
                    ((number + 2 * i) * (number + 2 * i)  <= 0))
            {
                number = number + i;
                i = 1;
            }
            else
            {
                i = i * 2;
            }
        }

        if((number + i) * (number + i) == x)
        {
            i++;
        }
        return number + i - 1;
    }

    public static void main(String args[]){
        System.out.println(mySqrt(256));
    }

}
