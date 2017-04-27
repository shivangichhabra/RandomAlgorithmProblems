/**
 * Created by Shivangi on 4/16/2017.
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        int[] multi = new int[num1.length() + num2.length()];

        for(int i=num1.length()-1 ; i>=0 ; i--){
            for(int j=num2.length()-1; j>=0; j--){
                int mul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                int p1 = i+j, p2 = i+j+1;
                int sum = mul + multi[p2];

                multi[p1] += sum/10;
                multi[p2] = sum%10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int x : multi){
            if(!(sb.length() == 0 && x == 0)) {
                sb.append(x);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String args[]){
        MultiplyStrings ms = new MultiplyStrings();
        System.out.println(ms.multiply("121233456", "1000000000000"));
    }
}
