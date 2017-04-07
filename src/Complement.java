/**
 * Created by Shivangi on 3/13/2017.
 */
public class Complement {

    public void complementIt(int n) {
        StringBuilder comp = new StringBuilder();

        while (n > 0) {
            comp = (n % 2 == 1) ? comp.append("0") : comp.append("1");
            n /= 2;
        }
        String res = comp.reverse().toString();
        System.out.println(res + "  " +Integer.parseInt(res,2));
    }

    public void complementItAgain(int n) {
        System.out.println(~n & ((Integer.highestOneBit(n) << 1) - 1));
    }

    public void complementItAgainAgain(int n){
        int out = 0,pow = 0;
        while(out < n){
            out += Math.pow(2,pow);
            pow++;
        }
        System.out.println(n + "  " +  out +  "  " + (out - n));
    }

    public static void main(String args[]){
        Complement c = new Complement();
        int n = 5;
        c.complementIt(n);
        c.complementItAgain(n);
        c.complementItAgainAgain(n);
    }
}
