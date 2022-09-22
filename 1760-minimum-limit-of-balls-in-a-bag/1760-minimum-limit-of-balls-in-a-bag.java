class Solution {
    public int minimumSize(int[] arr, int maxOperations) {
        int n = arr.length;
        int max = 0;
        for(int val: arr){
            max = Math.max(val, max);
        }
        int low=1, high=max;
        int ans = -1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(isMin(arr, mid, n,maxOperations )){
                ans = mid;
                high = mid-1;   // left
            }else{
                low = mid+1;      // right
            }
        }
        return ans;
    }
    
    public boolean isMin(int[] arr,int mid, int n,int maxOperations){
        int operations=0;
        for(int val: arr){
            if(val>mid){
               operations  += val/mid;
               if(val%mid==0){
                  operations--;
                } 
            }           
        }
        return operations<=maxOperations;
    }
}