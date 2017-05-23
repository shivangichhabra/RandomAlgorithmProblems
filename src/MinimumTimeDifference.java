import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference {

	public int findMinDifferenceOne(List<String> timePoints) {
		List<Integer> mins = new ArrayList<>();
		for(int i=0; i<timePoints.size(); i++){
			int val = Integer.valueOf(timePoints.get(i).substring(0,2))*60 + Integer.valueOf(timePoints.get(i).substring(3,5));
			mins.add(val);
		};
		Collections.sort(mins);
		int max = 24*60;
		for(int i=0; i<mins.size()-1; i++){
			max = Math.min(max, mins.get(i+1)-mins.get(i));
		}
		//when 00:00 is considered 2400, need to one more condition
		int x = 24*60 - (mins.get(mins.size()-1)-mins.get(0));
		return Math.min(max, x);
	}

	public int findMinDifferenceTwo(List<String> timePoints) {
		Collections.sort(timePoints);
		int time = 24*60;
		for(int i=0; i<timePoints.size()-1; i++){
			time = Math.min(time, getDiff(timePoints.get(i), timePoints.get(i+1))); 
		};
		//when 00:00 is considered 2400, need to one more condition
		int diff = 24*60 - getDiff(timePoints.get(0),timePoints.get(timePoints.size()-1));
		time = Math.min(time, diff);
		return time;
	}

	private int getDiff(String a , String b){
		int one = Integer.valueOf(a.substring(0,2))*60 + Integer.valueOf(a.substring(3,5));
		int two = Integer.valueOf(b.substring(0,2))*60 + Integer.valueOf(b.substring(3,5));
		return (two-one);
	}

}
