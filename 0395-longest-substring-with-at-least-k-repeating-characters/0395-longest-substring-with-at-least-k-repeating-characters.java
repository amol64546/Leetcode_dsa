class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        
        int[] freq = new int[26];
        for(int i=0; i<n; i++){
            int index = s.charAt(i)-'a';
            freq[index]++;
        }
        
        int ans = 0;
        int i=0;
        boolean flag = false;
        for(int j=0; j<n; j++){
            if(freq[s.charAt(j)-'a']<k){
                String substr = s.substring(i,j);
                ans = Math.max(ans,longestSubstring(substr,k));
                i = j+1;
                flag = true;
            }
        }
        
        if(!flag){
            return n;
        }
        String substr = s.substring(i);
        return Math.max(ans,longestSubstring(substr,k));
    }
}