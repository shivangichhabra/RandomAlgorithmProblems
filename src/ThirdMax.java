/**
 * Created by Shivangi on 3/27/2017.
 */
public class ThirdMax {

    public static int findThirdLargest(int[] a){
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for(Integer n : a){
            if(n.equals(max1) || n.equals(max2) || n.equals(max3))
                continue;
            if(max1 == null || n > max1 ){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
            else if(max2 == null || n>max2 && n<max1){
                max3 = max2;
                max2 = n;
            }
            else if(max3 == null || n>max3 && n <max2){
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }

    public static void main(String args[]){
        int a[] = {3, 2, 1};
        System.out.println(findThirdLargest(a));
    }
}
