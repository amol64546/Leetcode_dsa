class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==1) return s;
        String ans = "";
        int maxLen=0;        
        for(int i=0; i<n; i++){
            // odd  length         
                int l=i, r=i;                
                while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                    int len=r-l+1;
                    if(len>maxLen){
                        ans = s.substring(l,r+1);
                        maxLen = len;
                    }
                    l--; r++;
                }                        
            
            // even length          
                l=i; r=i+1;                 
                while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                    int len=r-l+1;
                    if(len>maxLen){
                        ans = s.substring(l,r+1);
                        maxLen = len;                    }
                    l--; r++;
                }
            
        }
        return ans;
    }
}