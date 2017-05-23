
public class LongestPalindrome {
	/*
	 * This can be in O(n^2) with O(1) by generating all odd and even length substrings
	 * and keeping tracking of longest substring.
	 * 
	 *  Odd -> get one center point and expand in both directions from that
	 *  Even->get two center points and expand in both direction
	 */

	public String longestPalindrome(String s) {
		if(s.isEmpty())
			return "";
		
		if(s.length()==1)
			return s;
		
		String longest = s.substring(0, 1);
		for(int i=0; i<s.length(); i++){
			String temp = getPalindromeSubstring(s, i, i);
			if(temp.length() > longest.length())
				longest = temp;
			
			temp = getPalindromeSubstring(s, i, i+1);
			if(temp.length() > longest.length())
				longest = temp;
		}
		
		return longest;
	}
	
	
	public String getPalindromeSubstring(String s, int start, int end){
		while(start >= 0 && end <= s.length()-1  && s.charAt(start) == s.charAt(end)){
			start--;
			end++;
		}
		//expand in both directions
		return s.substring(start+1, end);
	}

	public static void main(String args[]){
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.longestPalindrome("babad"));
	}
}
