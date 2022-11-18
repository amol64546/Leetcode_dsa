class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // selling price - rightmax
        // buying price - current value
        int rightmax = prices[n-1];  
        int profit=0;
        for(int i=n-2; i>=0; i--){            
            profit = Math.max(profit, rightmax-prices[i]);
            rightmax = Math.max(prices[i],rightmax);
        }
        return profit;
    }
}