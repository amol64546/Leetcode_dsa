class Solution {
    public int reverse(int n) {
        
        // for negative values
        int flag = n<0 ? -1:1;
        n = n*flag;
        
         
         long r=0;      
        while(n>0){
            r = r*10+ n%10; 
            n/=10;
        } 
        
        // for over 32bit, i.e. long type
        if(r<=Integer.MIN_VALUE || r>=Integer.MAX_VALUE)
            return 0;
            
            
       return (int)r*flag;
    }
}