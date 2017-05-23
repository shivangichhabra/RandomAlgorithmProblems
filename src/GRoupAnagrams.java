import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GRoupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null)
            return new ArrayList<List<String>>() ;
       
        Map<String, List<String>> map = new HashMap<>();
        //Arrays.sort(strs);
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!map.containsKey(key))
                map.put(key, new ArrayList<String>());
            
            map.get(key).add(s);    
        }
        
        return new ArrayList<List<String>>(map.values());
    }
}
