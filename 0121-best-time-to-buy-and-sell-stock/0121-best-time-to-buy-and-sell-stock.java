class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int prefixMin = arr[0];
        int profit=0;
        for(int i=1; i<n; i++){
            profit = Math.max(profit,arr[i]-prefixMin);
            prefixMin = Math.min(prefixMin, arr[i]);            
        }
        return profit;
       
    }
}