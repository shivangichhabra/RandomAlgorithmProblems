
public class DecodeWays {
	
	public int numDecodingsOne(String s) {
        if(s==null || s.length()==0 || s.charAt(0) == '0')
            return 0;
        
        if(s.length() == 1)
            return 1;
        
        int[] dp = new int[s.length()];
        dp[0] = 1;
        if(Integer.parseInt(s.substring(0,2)) > 26){
            if(s.charAt(1) == '0')
                dp[1] = 0;
            else    
                dp[1] = 1;
        } else {
            if(s.charAt(1) == '0')
                dp[1] = 1;
            else    
                dp[1] = 2;
        }
        
        for(int i=2; i<s.length(); i++){
            if(s.charAt(i) != '0')
                dp[i] += dp[i-1];
                
            int val = Integer.parseInt(s.substring(i-1, i+1));
            if(val <= 26 &&  val >=10)
                dp[i] += dp[i-2];
        }
        
        return dp[s.length()-1];
    }
	
	public int numDecodingsTwo(String s) {
		 if(s==null || s.length()== 0 || s.charAt(0)=='0')
	            return 0;
	        
	        if(s.length() == 1)
	            return 1;
	            
	        int[] dp = new int[s.length()+1];
	        dp[0] = 1;
	        dp[1] = s.charAt(0) =='0' ? 0 : 1;
	        
	        for(int i=2; i<=s.length(); i++){
	            int first = Integer.parseInt(s.substring(i-1, i));
	            int second = Integer.parseInt(s.substring(i-2, i));
	            if(first >= 1 && first <= 9)
	                dp[i] += dp[i-1];
	                
	            if(second >= 10 && second <= 26)
	                dp[i] += dp[i-2];
	        }
	        return dp[s.length()];
	}
	
	public static void main(String args[]){
		DecodeWays d = new DecodeWays();
		System.out.println(d.numDecodingsOne("823"));
	}
}
