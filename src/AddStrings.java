/**
 * Created by Shivangi on 3/29/2017.
 */
public class AddStrings {


    public Long atoi(String num){
        Long sum = Long.valueOf(0);
        int start = 0;
        boolean isNeg = false;

        if(num.charAt(0) == '-'){
            start = 1;
            isNeg = true;
        }

        if(num.charAt(0) == '+'){
            start = 1;
        }

        for(int i= start; i<num.length(); i++){
            int x = num.charAt(i)- '0';
            sum = x + sum*10;
        }

        if(isNeg)
            return ((-1)*sum);
        return sum;
    }

    public String add(String a, String b){
        return String.valueOf(atoi(a) + atoi(b));
    }


    public String addStrings(String num1, String num2) {
        int len1 = num1.length()-1;
        int len2 = num2.length()-1;

        StringBuilder res = new StringBuilder();
        int sum =0, carry =0;
        while(len1 >= 0 || len2 >= 0){
            int x = len1>=0 ? num1.charAt(len1)-'0' : 0;
            int y = len2>=0 ? num2.charAt(len2)-'0' : 0;
            sum = carry + x + y;
            if(sum <= 9){
                res.insert(0,sum);
                carry = 0;
                sum = 0;
            } else {
                res.insert(0, sum%10);
                carry = 1;
                sum = 0;
            }
            len1--;
            len2--;
        }

        if(carry == 1)
            res.insert(0,"1");
        return res.toString();
    }

    public static void main(String args[]){
        AddStrings as = new AddStrings();
        System.out.println(as.addStrings("0", "0"));
    }
}
