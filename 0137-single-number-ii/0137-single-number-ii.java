class Solution {
    public int singleNumber(int[] arr) {
        
        int ans=0;
        for(int i=0; i<32; i++){
            int p=0;
            for(int val: arr){
                if( (val & (1<<i)) !=0){                    
                    p=(p+1)%3;
                }             
            
            }          
           
            ans = ans | (p<<i);
        }
        return ans;
        
    }
}