class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int val: nums){
            if(digits(val)%2==0){
                count++;
            }
        }
        return count;
    }
    
    public int digits(int  n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}