import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
	
	String[] KEYS = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public List<String> letterCombinations(String digits) {
		List<String> output = new ArrayList<String>();
		return getSubsets(output, "", digits, 0);
        
    }
	
	public List<String> getSubsets(List<String> output, String subset, String digits, int offset){
		if(offset >= digits.length()){
			output.add(subset);
			return output;
		}
		
		String chars = KEYS[digits.charAt(offset)-'0'];
		for(int i=0; i<chars.length(); i++)
			getSubsets(output, subset+chars.charAt(i), digits, offset+1);
		
		return output;
	}
	
	public static void main(String args[]){
		LetterCombination lc = new LetterCombination();
		List<String> l = lc.letterCombinations("23");
		
		for(int i=0; i<l.size(); i++)
			System.out.print(l.get(i) + " ");
	}
}
