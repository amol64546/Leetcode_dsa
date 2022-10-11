class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int n = arr.length;
         int[] prefix=new int[n]; 
        prefix[0]=1;
        prefix[1]=arr[0];
        for(int i=2; i<n; i++){         
          prefix[i] = prefix[i-1]*arr[i-1];            
        }
        
        int[] suffix=new int[n];
        suffix[n-1]=1;
        suffix[n-2]=arr[n-1];
        for(int i=n-3; i>=0; i--){
           suffix[i] = suffix[i+1]*arr[i+1];            
        }
        
        int[] ans = new int[n];        
        for(int i=0; i<n; i++){         
          ans[i] = prefix[i]*suffix[i];            
        }
        return ans;
    }
}