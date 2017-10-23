/**
 * Created by keepi on 6/23/2017.
 */
public class ExcelSheetNumber {

    public int titleToNumber(String s) {
        int count = 0;

        for(int i=0; i<s.length(); i++){
            count = count*26 + ((s.charAt(i)-'A')+1);
        }
        return count;
    }

    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        while(n > 0){
            n--;
            s.append((char)(n%26 +'A'));
            n = n/26;
        }
        return s.reverse().toString();
    }

    public static void main(String args[]){
        ExcelSheetNumber es = new ExcelSheetNumber();
        System.out.println(es.titleToNumber("AABZWER"));
        System.out.println(es.convertToTitle(26));
    }


    /*
    int val = 0;
    for(int i: s.length){
        val = val*26 + (s.charAt(i)-'A')+1
    }
     */
}
