/**
 * Created by Shivangi on 6/23/2017.
 */
public class HappyNumber {

    public int getNextNumber(int n){
        int sum = 0;
        while(n>0){
            sum += ((n%10)*(n%10));
            n = n/10;
        }
        return sum;
    }

    public boolean isHappyOne(int n) {
        int x = n, y = n;
        while(x>0){ //only number <= 6 can lead to infinite loop
            x = getNextNumber(x);
            if(x==1) return true;
            y = getNextNumber(getNextNumber(y));  // to avoid infinite loop
            if(y==1) return true;
            if(x==y) return false;
        }
        return true;
    }

    public boolean isHappyTwo(int n) {
        if(n == 1)
            return true;
        while(n>6){ //only number <= 6 can lead to infinite loop
            n = getNextNumber(n);
            if(n==1) return true;
        }
        return false;
    }

    public static void main(String args[]){
        HappyNumber hp = new HappyNumber();
        System.out.println(hp.isHappyOne(19) + "  " + hp.isHappyOne(23461));
        System.out.println(hp.isHappyTwo(19) + "  " + hp.isHappyTwo(23461));
    }

}
