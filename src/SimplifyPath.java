import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SimplifyPath {
	
	public String simplifyPath(String path) {
		Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
		Stack<String> stack = new Stack<>();
		StringBuilder result = new StringBuilder();
		
		for(String s: path.split("/")){
			if(s.equals("..") && !stack.isEmpty())
				stack.pop();
			else if(!skip.contains(s))
				stack.push(s);
		}
		
		for(String dir: stack)
			result.append("/").append(dir);
		
		return result.length()==0 ? "/" : result.toString();
	}
	
	public static void main(String args[]) {
		SimplifyPath sp = new SimplifyPath();
		String path = "/home/a/b/c";
		System.out.println(sp.simplifyPath(path));
	}
}
