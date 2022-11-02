class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int n = s.length();
        
        
        int i;
        int[] cost = new int[n];
        for( i=0; i<n; i++){
            cost[i] = Math.abs(s.charAt(i)-t.charAt(i));         
        }
        
        int currCost=0, ans=0;
        i=0;
        int j=-1;
        while(++j<n){
            currCost +=cost[j];
            while(i<=j && currCost>maxCost){
                currCost-=cost[i++];  
                
            }  
            if(currCost<=maxCost)
                ans = Math.max(ans, j-i+1);
           
                
        }
        return ans;
    }
}