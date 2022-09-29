class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        
        int n = arr.length;
        int l=0, r=n-1;
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
        return 0;
    }
}