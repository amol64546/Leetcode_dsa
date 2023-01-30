
class Solution {
    
    int count=0;

    public void extendPalindrome(String s, int l, int r){       
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            count++;
            l--; r++;
        } 
    }
    
   public int countSubstrings(String s) {
        int n = s.length();
        
        for(int i=0; i<n; i++){
            // odd                                             
            extendPalindrome(s,i,i);
            // even  
            extendPalindrome(s,i,i+1);  
      
        }
        return count;
    }
}