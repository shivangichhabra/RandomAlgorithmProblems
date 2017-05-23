
public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0) return 0;
        
        int time =0;
        for(int i=0; i<timeSeries.length-1; i++){
            if(timeSeries[i]+duration < timeSeries[i+1])
                time += duration;
            else
                time += (timeSeries[i+1] - timeSeries[i]);
        }
        return time+duration;
    }
}
