import java.util.Scanner;

/**
 * Created by shivangi on 2/28/17.
 */
public class Factorial {
    /*
    Recursive
     */
    public int factR(int n){
        if(n <= 1)
            return 1;
        else
            return n * factR(n-1);
    }

    /*
    Iterative
     */
    public int factI(int n){
        int fact = 1;
        if(n <= 1)
            return 1;
        for(int i=2; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]){
        Factorial f = new Factorial();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f.factR(n));
        System.out.println(f.factI(n));
    }
}
