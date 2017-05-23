import java.util.Arrays;

public class NextGreaterElement {

	/*
	 * O(n^2)
	 */
	public int nextGreaterElementOne(int n) {
		char[] num = String.valueOf(n).toCharArray();

		for(int i=num.length-2; i>0; i++){
			int minIdx = i;
			for(int j=i+1; j<num.length; j++){
				minIdx = num[j] > num[i] ? j : minIdx; 
			}

			if(minIdx != i){
				//swap 
				char temp = num[i];
				num[i] = num[minIdx];
				num[minIdx] = temp;

				Arrays.sort(num, i+1, num.length);

				long val = Long.parseLong(String.valueOf(num));
				return ( val <= Integer.MAX_VALUE) ? (int) val : -1;
			}
		}

		return -1;
	}

	/*
	 * O(n)
	 */
	public int nextGreaterElementTwo(int n) {
		char[] number = String.valueOf(n).toCharArray();
		int i = 0;
		
		for(i=number.length-1; i>0; i--){
			if(number[i] > number[i-1])
				break;
		}
		
		if(i==0)
			return -1;
			
		
		int minIdx = i;
		for(int j=i+1; j<number.length; j++)
			minIdx = number[j] > number[i-1] ? j : minIdx;
			
		char temp = number[i-1];
		number[i-1] = number[minIdx];
		number[minIdx] = temp;
		
		Arrays.sort(number, i, number.length);
		
		long val = Long.parseLong(String.valueOf(number));
		return (val > Integer.MAX_VALUE) ? -1 : (int) val;
	}

	public static void main(String args[]){
		NextGreaterElement ng = new NextGreaterElement();
		int n = 1234;
		System.out.println(ng.nextGreaterElementOne(n));
		System.out.println(ng.nextGreaterElementTwo(n));
	}
}
