import java.util.HashMap;

/**
 * Created by Shivangi on 4/20/2017.
 */
public class MaxFrequencyChar {

    public void getMax(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int elementCount = 0, count = 0;
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                elementCount = map.getOrDefault(s.charAt(i), 0)+1;
            }
            map.put(s.charAt(i), elementCount);

            if(count<elementCount)
                count = elementCount;
        }
        System.out.println(count);
    }

    public static void main(String args[]){
        MaxFrequencyChar x = new MaxFrequencyChar();
        x.getMax("aabbbbaaacccdddddd  dasd");
    }
}
