/**
 * Created by Shivangi on 3/13/2017.
 */
public class HammingDistance {

    public static void DtoB(int n){
        StringBuilder s = new StringBuilder();

        while(n>0){
            s = s.append(n%2);
            n /= 2;
        }
        s.reverse().toString();
    }

    private String append(String s, int diff){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<diff; i++){
            sb.append("0");
        }
        s = sb.append(s).toString();
        return s;
    }


    public  void distance(int a, int b){
        String first = Integer.toBinaryString(a);
        String second = Integer.toBinaryString(b);

        int diff = Math.abs(first.length() - second.length());
        if(first.length() < second.length() )
            first = append(first,diff);
        else
            second = append(second, diff);
        int count = 0;
        for(int i=0; i<first.length(); i++){
            if(first.charAt(i) != second.charAt(i))
                count++;
        }
        System.out.println(count);
    }

    public void getHD(int a, int b){
        System.out.println(Integer.bitCount(a ^ b));
    }

    public void getHDistance(int a , int b){
        int xor = a^b,count = 0;
        for(int i=0; i< 32; i++)
            count += xor >> i & 1;
        System.out.println(count);
    }
    public static void main(String args[]){
        HammingDistance hd = new HammingDistance();
        DtoB(3);
        hd.distance(1,4);
        hd.getHD(1,4);
        hd.getHDistance(1,4);
    }
}
