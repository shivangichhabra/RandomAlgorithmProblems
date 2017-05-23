import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLength {
	
	/*
	 * The idea is use a hash set to track the longest substring without repeating characters so far, 
	 * use a fast pointer j to see if character j is in the hash set or not, if not, great, add it to the 
	 * hash set, move j forward and update the max length, otherwise, delete from the head by using a 
	 * slow pointer i until we can put character j to the hash set.
	 */
	public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        
        Set<Character> set = new HashSet<>();
        int j = 0, i=0, max = 0;
        
       while(i<s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(j++));
            }
        }
        return max ;
    }
}
