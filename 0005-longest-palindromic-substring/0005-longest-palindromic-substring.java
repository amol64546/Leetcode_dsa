class Solution {
 
    int maxLen=0;
    int minLeft=0, maxRight=0;

    public void extendPalindrome(String s, int l, int r){       
         while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){             
              l--; r++;
         } 
        int len=r-l+1;
        if(len>maxLen){
             minLeft = l+1;
             maxRight = r-1;
             maxLen = len;
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
        return s.substring(minLeft,maxRight+1);
    }
}