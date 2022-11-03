class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
       int n = s.length();
        int start=0;
        int ans = 0, i;
        for( i=0; i<n; i++){
            maxCost -= Math.abs(s.charAt(i)-t.charAt(i));
            // System.out.print(maxCost+" ");
            if(maxCost<0){
                maxCost += Math.abs(s.charAt(start)-t.charAt(start));
                start++;
            }
            // System.out.println(maxCost+" ");
            // ans = Math.max(ans,i-start+1);
            // System.out.println(i+" "+start);
        }
        // System.out.println(i+" "+start);
        
        return i-start;
    }
}