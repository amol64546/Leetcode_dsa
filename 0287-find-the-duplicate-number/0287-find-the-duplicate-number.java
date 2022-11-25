class Solution {
    public int findDuplicate(int[] nums) {
       int n=nums.length;
        int[] visited = new int[n];
        for(int i=0; i<n; i++){
            int index=Math.abs(nums[i]);
            if(visited[index]<0){
                return index;                
            }
            else
                visited[index]=-1;
        }
        return 0;
    }
}