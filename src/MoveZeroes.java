/**
 * Created by Shivangi on 4/16/2017.
 */
public class MoveZeroes {

    public static void moveZero(int []a){
        int j = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + "  ");
        }
    }


    public static void main(String args[]){
        int a[] = {0, 1, 0, 3, 12};
        moveZero(a);


    }
}
