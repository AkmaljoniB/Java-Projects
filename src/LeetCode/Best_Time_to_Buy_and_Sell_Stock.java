package LeetCode;

public class Best_Time_to_Buy_and_Sell_Stock{
    public int maxProfit(int[]prices){
        int min=prices[0],max=0;
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}
