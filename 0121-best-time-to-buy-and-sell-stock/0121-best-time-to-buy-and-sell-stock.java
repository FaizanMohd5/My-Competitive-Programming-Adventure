class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyingPrice = prices[0];
        
        for(int i=1; i<prices.length; i++){
            int sellingPrice = prices[i];
            buyingPrice = Math.min(buyingPrice, prices[i-1]);
            maxProfit = Math.max(maxProfit, sellingPrice - buyingPrice);
        }
        return maxProfit;
    }
}