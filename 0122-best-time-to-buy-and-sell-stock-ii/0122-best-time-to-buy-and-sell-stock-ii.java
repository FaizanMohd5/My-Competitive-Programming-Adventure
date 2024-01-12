class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        int i=0;
        while(i < prices.length-1){
            buy = prices[i];
            int sell = prices[i+1];
            int profit = sell - buy;
            
            if(profit < 0)
                profit = 0;            
                
            maxProfit += profit;
            
            i++;
        }
        return maxProfit;
    }
}