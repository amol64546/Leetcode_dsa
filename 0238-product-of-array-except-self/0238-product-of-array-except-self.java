class Solution {
    public int[] productExceptSelf(int[] nums) {
        
         int n = nums.length;
        
         int[] suffixProd = new int[n];   
          suffixProd[n-1] = 1;
        
        for(int i=n-2; i>=0; i--){
            suffixProd[i] = suffixProd[i+1] * nums[i+1];
        }
        
        
        int prefixProd = 1;
        
        for(int i=0; i<n; i++){
            int temp = prefixProd * nums[i];
            nums[i] = prefixProd * suffixProd[i];
            prefixProd = temp; 
        }
        return nums;
        
    }
}