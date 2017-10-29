import java.util.HashMap;

/**
 * Created by Shivangi on 10/29/2017.
 */
public class MostFrequentElement {

    public int getFrequenctElement(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int maxElement = -1;
        for(int i : a){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
                if(map.get(i) > maxCount) {
                    maxCount = map.get(i);
                    maxElement = i;
                }
                else if(map.get(i) == maxCount && maxElement < i){   //can be reversed to get smallest element too.
                    //without this condition -> will give the first element with highest frequency if multiple element has same frequency
                    //with this-> will give with the highest element with highest frequency if multiple element has same frequency
                    maxElement = i;
                }
            }
            else{
                map.put(i, 1);
            }
        }
        return maxElement;
    }

    public static void main(String args[]){
        MostFrequentElement mf = new MostFrequentElement();
        int []a = {1,2,3,5,2,3,2,3};
        System.out.println(mf.getFrequenctElement(a));
    }
}
