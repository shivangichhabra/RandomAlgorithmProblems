/**
 * Created by shivangi on 3/20/17.
 */
public class MergeArray {


    /*
    O(n+m) space
    o(n) time
     */
    public int[] method1(int[]a, int b[]){
        int c[] = new int[a.length+b.length];
        int j=0, k=0;

        for(int i=0; i<c.length; i++){
            if(j<a.length && k<b.length){
                if(a[j] <= b[k]){
                    c[i] = a[j];
                    j++;
                }
                else {
                    c[i] = b[k];
                    k++;
                }

            }
            else if(j<a.length){
                c[i] = a[j];
                j++;
            }
            else{
                c[i] = b[k];
                k++;
            }
        }

        return c;
    }

    /*
    Returning two array sorted in order can merge them
    at end of a to start of b
     */
    public void method2(int[] a, int[] b) {

        for (int i = b.length - 1; i >= 0; i--)
        {
            int j, last = a[a.length - 1];
            for (j = a.length - 2; j >= 0 && a[j] > b[i]; j--)
                a[j + 1] = a[j];

            if (j != a.length - 2 || last > b[i])
            {
                a[j + 1] = b[i];
                b[i] = last;
            }
        }
    }

    /*
    Can use this method to merge in the same array provided extra space exist at the end
     */
    public  void method3(int[] a, int[] b){
        int i = a.length;
        int j = b.length;
        while(i>0 && j>0){
            if(a[i-1] > b[j-1]) {
                a[i + j - 1] = a[i - 1];
                i--;
            }else {
                a[i + j - 1] = b[j - 1];
                j--;
            }
        }

        while( j > 0){
            a[i+j-1] = b[j-1];
            j--;
        }
    }


    public static void main(String args[]){
        MergeArray ma = new MergeArray();
        int a[] = {1,3,5,7,9,11};
        int b[] = {12,14,16,18};
        int[] c = ma.method1(a,b);

        for(int i=0; i<c.length; i++){
            System.out.print(c[i] + "  ");
        }

        System.out.println("\n");

        ma.method2(a,b);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + "  ");
        }
        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + "  ");
        }
    }
}
