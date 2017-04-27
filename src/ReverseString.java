/**
 * Created by Shivangi on 3/8/2017.
 */
public class ReverseString {

    public String reverse(String s){
        StringBuilder output = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            output.append(s.charAt(i));
        }
        return output.toString();
    }

    public String reverseTwo(String s, int k){
        if(k >= s.length())
            return  reverse(s);

        StringBuilder b = new StringBuilder();
        boolean flag = true;
        for(int i=0; i<s.length()-k; i= i+k){
            if(flag)
                b.append(reverse(s.substring(i,i+k)));
            else
                b.append(s.substring(i,i+k));
            flag = !flag;
        }
        if((s.length() - b.length()) <= k && s.length() > 2*k)
            b.append(reverse(s.substring(b.length(), s.length())));
        else
            b.append(s.substring(b.length(), s.length()));
        return b.toString();
    }


    public String reverseByk(String s, int k){
        char[] array = s.toCharArray();
        for(int i=0; i<array.length; i += 2*k ){
            swap(array, i, i+k);
        }
        return String.valueOf(array);
    }

    public void swap(char[] array, int i, int j){
        j = Math.min(array.length, j) - 1;
        while(i<j){
            char temp = array[i];
            array[i++] = array[j];
            array[j--] = temp;
        }
    }

    public static void main(String args[]){
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseByk("abcd", 2));
        System.out.println(rs.reverseByk("abcdefg", 2));
        System.out.println(rs.reverseByk("abcdefg", 4));
        System.out.println(rs.reverseByk("jlnnxsetgcpsbhsfymrkhfursyissjnsocgdhgfxtxrlvugsaphqzxllwebukgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc", 20));
        System.out.println(rs.reverseByk("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl", 39));
    }
}
/*
khlzvvxxcawgwkzgospzxuaahjaqagdfjkmyutvhxclzprhwjdlzltpzgfvjkcxvksocfugzqkpaxexezbvggtkoccgdrbxocrfopuviqsyirxvphvdtvrjtsbospmgyfduvnomqaadoizelpeuwxvnlsasxjszyjwjmvgdqgowjjtwdncagtnyfdemijulnrivnymtvyqujvehhvruiolfkeprqexloytdxzmmekuepamvdzpixatgsupvpidmeyifjyxkzxgx
 */