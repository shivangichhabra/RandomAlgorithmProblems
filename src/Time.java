import java.util.Scanner;

/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 *
 * Sample Input:
 *  07:05:45PM
 *
 * Sample Output:
 *  19:05:45
 */
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String zone = time.substring(8);
        int hour = Integer.parseInt(time.substring(0,2));
        String newtime = time.substring(0, time.length()-2);
        if(zone.equals("PM")){
            if( hour < 12)
                hour += 12;
                newtime = newtime.replace(time.substring(0,2),String.valueOf(hour));
            } else {
                if(hour == 12)
                    newtime = newtime.replace(time.substring(0,2), "00");
            }
        System.out.println(newtime);
    }
}
