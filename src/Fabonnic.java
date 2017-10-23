/**
 * Created by shivangi on 4/10/17.
 */
public class Fabonnic {
    /*
    Recursive
     */
    public static int fabR(int n){
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        return fabR(n-1)+fabR(n-2);
    }

    /*
    Iterative
     */
    public static void fabI(int n){
        int fab = 1;
        int fab1 = 0;
        int fab2 = 1;
        for(int i=2; i<=n; i++){
            fab = fab1+fab2;
            fab1 = fab2;
            fab2 = fab;
        }
        System.out.print(fab + " ");
    }

    public static void main(String args[]){

        for(int i=0; i<=5; i++){
            System.out.print(fabR(i) + " ");
        }
        System.out.println("\n");
        System.out.print("0 ");
        for(int i=1; i<=5; i++){
            fabI(i);
        }
    }
}
