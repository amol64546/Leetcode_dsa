class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int sum = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        int low = max, high=sum;
        int ans = 0;
        while(low<=high){
            int mid = (high+low)/2;
            if(isValid(arr,n,days, mid)){
                ans = mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    
    boolean isValid(int[] arr, int n, int days, int mid){
        int sum=0, countD=1;
        for(int i=0; i<n; i++){
            if(sum+arr[i]<=mid){
                sum+=arr[i];
            }else{
                countD++;
                sum = arr[i];
            }
        }
        if(countD<=days)
            return true;
        return false;
        
    }
}