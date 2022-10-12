class Solution {
    public int findMiddleIndex(int[] arr) {
        int n = arr.length;     
      
        int sum=0;
        for(int i: arr)
            sum+=i;
        
        int prefix=0, suffix=0;        
        for(int i=0; i<n; i++){                            
             suffix= sum-prefix;
             prefix+=arr[i];
            if(prefix==suffix)
                   return i;
	     }                
          
        return -1;
    }
}