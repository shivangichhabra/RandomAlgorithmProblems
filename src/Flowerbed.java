/**
 * Created by Shivangi on 6/24/2017.
 */
public class Flowerbed {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 0 || flowerbed == null || n > flowerbed.length)
            return false;
        int count = 0;
        for(int i=0; i<flowerbed.length && count < n; i++){
            if(flowerbed[i] == 0){
                int prev = (i == 0) ? 0 : flowerbed[i-1];
                int next = (i == flowerbed.length-1) ? 0 : flowerbed[i+1];
                if(prev == 0 && next == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count == n;
    }
    public static void main(String args[]){
        Flowerbed fb = new Flowerbed();
        int[] a = {1,0,0,1};
        System.out.println(fb.canPlaceFlowers(a,1));
    }
}
