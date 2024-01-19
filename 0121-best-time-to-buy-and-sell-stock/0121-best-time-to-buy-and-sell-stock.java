class Solution {
    public int maxProfit(int[] prices) {
        // BRUTE FORCE
        /* 
        int profit = 0;
        for(int i =0; i< prices.length;i++){
            for(int k = i+1; k<prices.length; k++){
                 if (prices[k] - prices[i] > profit){
                     profit = prices[k] - prices[i];
                 }
            }
        }
        return profit;
        */
        //OPTIMAL FROM DISCUSSION
        int buyingPrice = Integer.MAX_VALUE;
        int profit = 0;
        int currentProfit = 0;

        for(int i = 0; i < prices.length;i++) {
            if(prices[i] < buyingPrice){
                buyingPrice = prices[i];
            }
             
            currentProfit =prices[i] - buyingPrice;
            if(currentProfit > profit){
                profit = currentProfit;
            }  

        }

        return profit;
    }
}