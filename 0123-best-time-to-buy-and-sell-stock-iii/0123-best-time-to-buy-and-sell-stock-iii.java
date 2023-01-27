class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
       
        int l2r[] = new int[n]; 
        int mini = prices[0];
        for(int i=1; i<n; i++)    {
            int today =prices[i]-mini;
            int nottoday = l2r[i-1];
            l2r[i] = Math.max(today,nottoday);
            mini = Math.min(mini,prices[i]);
        }                 
           
        int r2l[] = new int[n]; 
        int maxi = prices[n-1];
        for(int i=n-2; i>=0; i--){
            int today = maxi - prices[i];
            int nottoday = r2l[i+1];
            r2l[i] = Math.max(today,nottoday);
            maxi = Math.max(maxi,prices[i]);
        }
        int profit=0;
        for(int i=0; i<n; i++){
            profit = Math.max(profit,l2r[i]+r2l[i]);
        }
        return profit;
    }
}