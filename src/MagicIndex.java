/*
/**
 * A magic index in an array A[0...n] is defined to be an index
 * such that A[i] = i. Given a sorted array of distinct integers,
 * write a method to find a magic index, if one exists, in array A.
 *
 * FOLLOW UP
 * What if the values are not distinct?
 */

public class MagicIndex {

    //complexity O(n)
    public int getIndex(int[] a){
        for(int i=0; i<a.length; i++){
            if(a[i] == i) {
                System.out.println(a[i] + "  " + i);
                return i;
            }
        }
        return -1;
    }


    //complexity O(logn)
    public int getIndexFaster(int[] a){
        return getIndexFaster(a, 0, a.length-1);
    }

    private int getIndexFaster(int[] a, int start, int end){
        if(start <= end) {
            int mid = (start+end)/2;
            if(a[mid] == mid)
                    return mid;
            else if(a[mid] < mid) //go right
                return getIndexFaster(a, mid+1, end);
            else
                return getIndexFaster(a, start, mid-1);
        }
        return -1;
    }

    public static void main(String args[]){
        MagicIndex mi = new MagicIndex();
        int[] a = {-40,-20,-1,1,2,3,5,6,7,9,12,13};
        System.out.println(mi.getIndex(a));
        System.out.println(mi.getIndexFaster(a));
    }
}
