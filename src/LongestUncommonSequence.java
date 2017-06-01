import java.util.Arrays;
import java.util.Comparator;

public class LongestUncommonSequence {
	public int findLUSlengthOne(String[] strs) {
		if(strs == null || strs.length == 0)
			return -1;
		
		Arrays.sort(strs, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}	
		});
		
		
		for(int i= strs.length-1; i>=0; i--){
			String str = strs[i];
			boolean flag = false;
			for(int j = strs.length-1; j>=0 && strs[j].length() >= str.length(); j--){
				if(i==j) continue;
				if(isSubstring(str, strs[j])){
					flag = true;
					break;
				}
			}
			if(!flag)
				return str.length();
		}
		return -1;
	}
	
	//check if s1 is substring of s2
	public boolean isSubstring(String s1, String s2){
		int i=0, j=0;
		int len1 = s1.length(), len2 = s2.length();
		while(i<len1 && j < len2 && len2-j >= len1-i){
			if(s1.charAt(i) == s2.charAt(j)){
				i++; j++;
			} else {
				j++;
			}
				
		}
		return i == len1;
	}

	public static void main(String args[]){
		LongestUncommonSequence lcs = new LongestUncommonSequence();
		String strs[] = {"aabbcc", "aabbcc","bc","bcc","aabbccc"};
		String test[] = {"aaa","aaa","aa"};
		System.out.println(lcs.findLUSlengthOne(strs));
	}
}
