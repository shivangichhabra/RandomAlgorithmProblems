/**
 * Created by FS047207 on 4/11/2017.
 */
public class CountMaxOnes {

    public static int count(int a[]) {
        int count = 0, max = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == 0) {
                count = 0;
            }else {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String args[]){
        int []a = {1,1,0,1,1,1, 0};
        System.out.println(count(a));
    }
}
