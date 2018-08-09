import java.util.Arrays;

public class NextGreaterElement {

	/*
	 * O(n)
	 */
	public int nextGreaterElement(int n) {
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
		int n = 12349870;
		System.out.println(ng.nextGreaterElement(n));
	}
}
