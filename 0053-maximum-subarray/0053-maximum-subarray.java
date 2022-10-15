class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int maxSum=Integer.MIN_VALUE, curSum=0;
       
        for(int i=0; i<n; i++){ 
            curSum+=arr[i];                                     
            maxSum = Math.max(curSum, maxSum);          
            
            if(curSum<0)
                curSum=0;  // discarding this subarr               
        }
        return maxSum;
    }
}