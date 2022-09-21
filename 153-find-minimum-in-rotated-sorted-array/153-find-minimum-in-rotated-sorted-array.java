class Solution {
    public int findMin(int[] arr) {
        int l=0, r=arr.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid]>arr[r]){      // mid lies in 1st subarr
                l=mid+1;
            }else if(arr[mid]<arr[r]){   //  mid lies in 2nd subarr
                r=mid;                   // mid could be min
                                         // 4,6,1,2,3
            }
        }
        return arr[l];   // l==r==min
    }
}