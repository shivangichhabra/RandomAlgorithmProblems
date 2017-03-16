/**
 * Reverse a String
 *
 * Sample Input:
 *  abcde
 *
 * Sample Output
 *  edcba
 */
public class ReverseString {
    public void reverseUsingStringBuilder(String s){
        System.out.println(new StringBuilder(s).reverse().toString());
    }

    public void reverse(String s){
        for(int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
    public char[] reverseInPlace(String s) {
        char[] stringChar = s.toCharArray();
        for(int i=0; i<s.length()/2; i++) {
            char c = stringChar[i];
            stringChar[i] = stringChar[s.length() - 1 - i];
            stringChar[s.length() - 1 - i] = c;
        }
        return stringChar;
    }

    public static void main(String args[]) {
        ReverseString rs = new ReverseString();
        String s = "Hello world";
        rs.reverseUsingStringBuilder(s);
        rs.reverse(s);
        System.out.println();
        char[] str = rs.reverseInPlace(s);
        for(int i=0; i<str.length; i++){
            System.out.print(str[i]);
        }
    }
}
