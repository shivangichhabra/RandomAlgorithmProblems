/**
 * Created by FS047207 on 6/6/2017.
 */
public class CalculateClockAngle {

    public double getAngle(int hour, int minute){
        System.out.println(hour + "  " + minute);
        if(hour < 0 || minute < 0)
            return -1;

        if(hour == 12)
            hour = 0;

        if(minute == 60){
            minute = 0;
            hour += 1;
        }

        double hourAngle = 0.5 * (60*hour + minute);  //angle for hour wand
        double minAngle = 6 * minute; //angle for minute wand
        double angle = Math.abs(hourAngle-minAngle);
        return Math.min(angle, 360-angle);
    }

    public static void main(String args[]){
        CalculateClockAngle c = new CalculateClockAngle();
        String time = "2:23";
        String[] values = time.split(":");
        System.out.println(c.getAngle(Integer.parseInt(values[0]), Integer.parseInt(values[1])));
    }
}
