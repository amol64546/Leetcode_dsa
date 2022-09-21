class Solution {
    public int searchInsert(int[] arr, int target) {
        
        int l=0, r=arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(target<arr[mid])
                r = mid-1;
            else if(target>arr[mid])
                l = mid+1;
            else
                return mid;
        }
        return l;
    }
}