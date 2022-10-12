class Solution {
    public int findMiddleIndex(int[] arr) {
        int n = arr.length;
        int[] prefix = arr.clone();
                for(int i=1; i<n; i++){
		    prefix[i]+= prefix[i-1];
	        } 
                int[] suffix = arr.clone();
                for(int i=n-2; i>=0; i--){
		    suffix[i]+= suffix[i+1];
	        } 
                for(int i=0; i<n; i++){
		      if(prefix[i]==suffix[i]){
                   return i;
                      }
                              
	       } 
           return -1;
    }
}