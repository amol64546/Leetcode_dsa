class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int n = arr.length;
         int[] ans=new int[n];
        
        ans[n-1]=1;
        int prod=1;
        for(int i=n-2; i>=0; i--){
            prod = ans[i+1]*arr[i+1];
           ans[i] = prod;            
        }
        
         
        prod =1;        
        for(int i=0; i<n; i++){ 
            ans[i] *= prod;
          prod *= arr[i];
                     
        }
        
       
        return ans;
    }
}