class Solution {
    public void moveZeroes(int[] nums) {
        int countZ=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                countZ++;
            }else if(countZ>0){
                // swap with last zero
                int temp = nums[i];
                nums[i] = 0;
                nums[i-countZ] = temp;
            }
        }
    }
}