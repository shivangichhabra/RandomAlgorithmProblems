/**
 * Created by Shivangi on 4/6/2017.
 */
public class URLify {

    public void convertToUrl(char[] array, int len){
        int countSpace = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == ' ')
                countSpace++;
        }
        int newLen = array.length + 2*countSpace;
        char[] newStr = new char[newLen];
        for(int i=array.length-1; i>=0; i--){
            if(array[i] == ' '){
                newStr[newLen-1] = '0';
                newStr[newLen-2] = '2';
                newStr[newLen-3] = '%';
                newLen = newLen-3;
            }
            else{
                newStr[newLen-1] = array[i];
                newLen = newLen-1;
            }
        }

        for(int i=0; i<newStr.length; i++)
            System.out.print(newStr[i]);

    }

    public static void main(String args[]){
        URLify url = new URLify();
        String s = "Mr John Smith Had a tiger   ";
        url.convertToUrl(s.toCharArray(), s.length());
    }
}
