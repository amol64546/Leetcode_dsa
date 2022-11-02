class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count=0, max=0;
        for(int i: arr){
            
            if(i==1){
                count++;
                max = Math.max(count,max);               
            }
            else
                 count=0;
                
                
        }
        return max;
    }
}