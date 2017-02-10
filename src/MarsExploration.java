import java.util.Scanner;

/**
 * Sami's spaceship crashed on Mars! She sends  sequential SOS messages to Earth for help.
 * Letters in some of the SOS messages are altered by cosmic radiation during transmission.
 * Given the signal received by Earth as a string, , determine how many letters of Sami's
 * SOS have been changed by radiation.
 *
 * Sample Input:
 *  SOSSPSSQSSOR
 *  SOSSOT
 *
 * Sample Output:
 *  3
 *  1
 */
public class MarsExploration {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int noOfMessages = s.length()/3;
        String expected = "";
        int count = 0;
        for(int i=0; i<noOfMessages; i++){
            expected += "SOS";
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != expected.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
