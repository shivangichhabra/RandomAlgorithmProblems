/**
 * Created by Shivangi on 6/23/2017.
 */
public class Sqrt {

    public  static int mySqrt(int n){
        if(n == 0)
            return 0;

        int start = 1, end = n;


        while(true) {
            int mid = (start+end)/2;
            if ((n/mid) < mid)
                end = mid - 1;
            else {
                if ( (n/(mid + 1)) < (mid+1))
                    return mid;
                else
                    start = mid + 1;
            }
        }
    }

    public static void main(String args[]){
        System.out.println(mySqrt(256));
    }

}
