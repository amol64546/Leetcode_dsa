class Solution {
    public boolean isPalindrome(int x) {
        
        if( x<0 || (x!=0 && x%10==0) ) return false;
        if(x<10) return true;
        
        
        int copy = x, r=0;
        while(x>0){
            r = r*10 + x%10;
            x/=10;
        }
        
        return r==copy;
    }
}