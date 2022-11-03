class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
       int n = s.length();
        int start=0;
        int ans = 0;
        for(int i=0; i<n; i++){
            maxCost -= Math.abs(s.charAt(i)-t.charAt(i));
            if(maxCost<0){
                maxCost += Math.abs(s.charAt(start)-t.charAt(start));
                start++;
            }
            ans = Math.max(ans,i-start+1);
        }
        
        return ans;
    }
}