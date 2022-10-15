class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int maxSum=Integer.MIN_VALUE, currSum=0;
       
        for(int i: arr){ 
            currSum = Math.max(i, i+currSum);                                     
            maxSum = Math.max(currSum, maxSum);                      
        }
        return maxSum;
    }
}