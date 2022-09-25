class Solution {
    public boolean isPalindrome(int x) {
        
        if( x<0 || (x!=0 && x%10==0) ) return false;
        if(x<10) return true;
        
        
        int r=0;
        while(r<x){
            r = r*10 + x%10;
            x/=10;
        }
        
        // even digits r==x
        // odd digits  (r/10)==x
        // O(half no of digits)
        return (r==x || (r/10)==x);
    }
}