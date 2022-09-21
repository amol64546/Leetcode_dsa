class Solution {
    public int search(int[] arr, int target) {
        
        // finding minInd
        int l=0, r=arr.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid]>arr[r]){
                l=mid+1;
            }else if(arr[mid]<arr[r]){
                r=mid;
            }
        }
        int minInd = r;
        
        // updating l and r to take one of subarr
        l=0; r=arr.length-1;
        if(arr[minInd]<= target && target<=arr[r])   // in range of 2nd subarr
            l = minInd;
        else //if(target>arr[r])     // in range of 1st subarr or value not exist
             r= minInd-1;
        
        
        // binary search on one of subarr
        while(l<=r){
            int mid = (l+r)/2;
            if(target<arr[mid])
                r = mid-1;
            else if(target>arr[mid])
                l=mid+1;
            else
                return mid;
            
        }
        return -1;
        
        
    }
}