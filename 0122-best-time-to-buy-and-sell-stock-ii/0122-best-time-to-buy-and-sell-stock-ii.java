class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] > prices[i-1]){
                //int buy = prices[i-1];
                ///int sell = prices[i];
                profit = profit + (prices[i] - prices[i-1]);
            }
        }
       // System.gc();
        return profit;
    }
}