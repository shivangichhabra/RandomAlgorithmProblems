/**
 * Created by Shivangi on 4/16/2017.
 */
public class Stocks {

    /*
    Only one transaction at a time
     */
    public int buySellOne(int[] prices){
        int maxCur = 0, maxSoFar = 0;
        for(int i=1; i<prices.length; i++){
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }

    public int buySellTwo(int[] prices){
        if(prices.length == 0)
            return 0;

        int min = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] < min)
                min = prices[i];
            else
                if(prices[i] - min > profit)
                    profit = prices[i]-min;
        }
        return profit;
    }

    /*
    Multiple Transactions
     */
    public int buySellMultiple(int[] prices){
        int profit = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i+1] > prices [i])
                profit += prices[i+1] - prices[i];
        }
        return profit;
    }


    public static void main(String args[]){
        Stocks s = new Stocks();
        int b[] = {7, 1, 5, 3, 6, 4};
        int a[] = {7,6,4,3,1};
        int c[] = {2,1,2,0,1};
        System.out.println(s.buySellMultiple(c));
        System.out.println(s.buySellOne(b));
    }
}
