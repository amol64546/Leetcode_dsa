class Solution {
    String ans = "";
    int maxLen=0;

    public void extendPalindrome(String s, int l, int r){       
                while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                    int len=r-l+1;
                    if(len>maxLen){
                        ans = s.substring(l,r+1);
                        maxLen = len;
                    }
                    l--; r++;
                } 
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==1) return s;
        for(int i=0; i<n; i++){
            // odd                                             
            extendPalindrome(s,i,i);
            // even  
            extendPalindrome(s,i,i+1);  
      
        }
        return ans;
    }
}