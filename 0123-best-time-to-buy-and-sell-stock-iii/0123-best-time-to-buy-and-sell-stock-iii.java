class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        
        int[] left = new int[n];
        int buy = prices[0];
        int profit = 0;
        for(int i=1; i<n; i++){
            profit = Math.max(profit,prices[i]-buy);
            left[i] = profit;
            buy = Math.min(buy,prices[i]);
            
        }
        
        int[] right = new int[n];
        int sell = prices[n-1];
        profit=0;
        for(int i=n-2; i>=0; i--){
            profit = Math.max(profit,sell-prices[i]);
            right[i] = profit;
            sell = Math.max(sell,prices[i]);
        }
        
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        
        profit = 0;
        for(int i=0; i<n; i++){
            profit = Math.max(profit,left[i]+right[i]);
        }
        return profit;
    }
}