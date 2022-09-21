class Solution {
    public int splitArray(int[] arr, int m) {
        int sum=0, max=0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            max= Math.max(max,arr[i]);
        }
        int high=sum, low=max;
        int ans = 0;
        while(low<=high){
            int mid=(high+low)/2;
            if(isValid(arr,mid,n,m)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    
    public boolean isValid(int[] arr, int mid, int n, int m){
        int sum=0, count=1;
        for(int i=0; i<n; i++){
            if(sum+arr[i]<=mid){
                sum+=arr[i];
            }else{
                count++;
                sum = arr[i];
            }
        }
        if(count<=m) return true;
        return false;
    }
        
}