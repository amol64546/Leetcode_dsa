class Solution {
    public int minDays(int[] arr, int m, int k) {
        
        int n = arr.length;  // no of flowers
        // m - no of bouquets
        // k - no of flowers per bouquets
        
        if(m*k>n) return -1;
        
        int l=0, r=0;
        int days=-1;
        for(int val: arr){
            l = Math.min(l, val);
            r = Math.max(r, val);
        }
        
        // ele in arr -> no of days
        while(l<=r){
            int mid = (l+r)/2; // no of days
            if(isMin(arr,m,k,mid)){
                days=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return days;
        
    }
    
    public boolean isMin(int[] arr, int m, int k, int mid){
         int n = arr.length;
        int b=0; // no of bouquets
        int f=0; // no of flowers per bouquets
         for(int val: arr){
             if(val<=mid){
                 f++;
                 if(f==k){
                     b++;
                     f=0;
                 }
                     
             }else
                 f=0;  // only use adjacent flowers
         }
        return b>=m;
    }
}