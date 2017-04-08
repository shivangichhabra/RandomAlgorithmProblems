import java.util.Scanner;

/**
 * Created by Shivangi on 3/9/2017.
 */
public class CountSegements {

    public static int count(String s){
        s  = s.trim();
        if(s.length() > 0)
            return s.split("\\s+").length;
        return 0;
    }

    public static int countSegments(String s) {
        s = s.trim();
        int count = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
                count++;
        }
        return s.length() > 0 ? count+1 :  count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countSegments(s));
        System.out.println(count(s));
    }
}
