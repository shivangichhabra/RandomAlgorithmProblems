import java.util.BitSet;
import java.util.Scanner;

/**
 * Java's BitSet class implements a vector of bit values (i.e.: false(0) or true(1))
 * that grows as needed, allowing us to easily manipulate bits while optimizing space
 * (when compared to other collections). Any element having a bit value of 1 is called
 * a set bit.
 *
 * Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized
 * to 0, perform a series of M operations. After each operation, print the number of
 * set bits in the respective BitSets as two space-separated integers on a new line.
 *
 * Sample Input:
 *  5 4
 *  AND 1 2
 *  SET 1 4
 *  FLIP 2 2
 *  OR 2 1
 *
 * Sample Output:
 *  0 0
 *  1 0
 *  1 1
 *  1 2
 */
public class BitsetTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        BitSet b1 = new BitSet(length);
        BitSet b2 = new BitSet(length);
        int operations = sc.nextInt();
        String s;
        int i,j;
        for(int k=0; k<operations; k++){
            s = sc.next();
            i = sc.nextInt();
            j = sc.nextInt();
            switch(s){
                case "AND":
                    if(i==1) b1.and(b2); else b2.and(b1);
                    break;
                case "OR":
                    if(i==1) b1.or(b2); else b2.or(b1);
                    break;
                case "XOR":
                    if(i==1) b1.xor(b2); else b2.xor(b1);
                    break;
                case "FLIP":
                    if(i==1) b1.flip(j); else b2.flip(j);
                    break;
                case "SET":
                    if(i==1) b1.set(j); else b2.set(j);
                    break;
            }
            System.out.println(b1.cardinality()+ " " + b2.cardinality());
        }
    }
}
