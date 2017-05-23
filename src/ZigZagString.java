
public class ZigZagString {
	
	public String convert(String s, int numRows) {
		 int len = s.length(); 
		 char[] c = s.toCharArray();
		 
		 StringBuilder[] result = new StringBuilder[numRows];
		 for(int i=0; i<numRows; i++)
			 result[i] = new StringBuilder();
		 
		 int x = 0;
		 while(x < len){
			 for(int j=0; j<numRows && x<len; j++)
				 result[j].append(c[x++]);
			 
			 for(int k=numRows-2; k>0 && x<len; k--)
				 result[k].append(c[x++]);
		 }
		 
		 for(int i=1; i<numRows; i++)
			 result[0].append(result[i]);
		 
		 return result[0].toString();
	}
	
	public static void main(String args[]){
		ZigZagString z = new ZigZagString();
		System.out.println(z.convert("HOWAREYOUTODAY", 3));
	}
}
