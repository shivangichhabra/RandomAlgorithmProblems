import java.util.Scanner;

/**
 * John has discovered various rocks. Each rock is composed of various elements, and
 * each element is represented by a lower-case Latin letter from 'a' to 'z'. An element
 * can be present multiple times in a rock. An element is called a gem-element if it occurs
 * at least once in each of the rocks.
 *
 * Given the list of  rocks with their compositions, display the number of gem-elements
 * that exist in those rocks.
 *
 * Sample Input:
 *  abcdde
 *  baccd
 *  eeabg
 *
 * Sample Output:
 *  2
 */
public class Gemstones {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        for(int i=0; i<n; i++){
            array[i] = sc.next();
        }

    }
}