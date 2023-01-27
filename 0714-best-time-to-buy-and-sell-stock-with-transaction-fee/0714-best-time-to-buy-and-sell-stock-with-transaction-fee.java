class Solution {
    public int maxProfit(int[] prices, int fee) {
         int n = prices.length;
        int prevBuy = -prices[0];
        int prevSell = 0;
        
        
        for(int i=1; i<n; i++){
            int todayBuy = Math.max(prevBuy,prevSell-prices[i]);
            int todaySell = Math.max(prevSell,prevBuy+prices[i]-fee);
           
            prevBuy = todayBuy;
            prevSell = todaySell;
           
        }
        return prevSell;
    }
}