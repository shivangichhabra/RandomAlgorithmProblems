/**
 * Created by Shivangi on 3/8/2017.
 */
public class Atoi{

    public static int StrToInt(String str){
        long num = 0;
        int sign = 1;
        int i = 0;

        if(str.length() == 0 || str ==  null)
            return 0;

        str = str.trim();

        if(str.charAt(0) == '+') {
            i = 1;
        }

        if(str.charAt(0) == '-') {
            sign = -1;
            i = 1;
        }

        while(i < str.length()){
            if(!Character.isDigit(str.charAt(i)))
                return (int) num * sign;
            num = num*10 + str.charAt(i)-'0';
            if(sign == 1 && num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(sign == -1 && (-1) * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }

        return (int) num * sign;
    }

    public static void main(String args[]){
        String num = "2147483648";
        System.out.println(StrToInt(num));
    }
}
