class Solution {
    public int findPeakElement(int[] arr) {
         int n = arr.length;
        if(n==1) return 0;   
        int l=0, r=n-1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid]>arr[mid+1])
                r=mid;
            else
                l=mid+1;
           
        }
        return r;
    }
}