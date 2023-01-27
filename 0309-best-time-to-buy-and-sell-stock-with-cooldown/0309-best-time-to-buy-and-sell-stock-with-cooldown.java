class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int prevBuy = -prices[0];
        int prevSell = 0;
        int prevCooldown = 0;
        
        for(int i=1; i<n; i++){
            int todayBuy = Math.max(prevBuy,prevCooldown-prices[i]);
            int todaySell = Math.max(prevSell,prevBuy+prices[i]);
            int todayCooldown = Math.max(prevCooldown,prevSell);
            
            prevBuy = todayBuy;
            prevSell = todaySell;
            prevCooldown = todayCooldown;
        }
        return prevSell;
    }
}