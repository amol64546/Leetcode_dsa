class Solution {
    public int findPeakElement(int[] arr) {
         int n = arr.length;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        
        int l=1, r=n-2;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }else if(arr[mid]<arr[mid-1]){
                r=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}