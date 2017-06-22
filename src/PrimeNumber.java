/**
 * Created by keepi on 6/19/2017.
 */
public class PrimeNumber {

    public int countPrimes(int n) {
        int count = 0;
        boolean[] notPrime = new boolean[n];

        for(int i=2; i<n; i++){
            if(notPrime[i] == false){
                count++;
                for(int j=2; i*j<n; j++){
                    notPrime[i*j] = true;
                }
            }
        }

        return count;
    }

    public static boolean isPrime(int n){
        for(int i=2; i*i <= n; i++){
            if(n%i == 0)
               return false;
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(isPrime(4));
    }
}
