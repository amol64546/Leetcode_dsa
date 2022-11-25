class Solution {
    public int findDuplicate(int[] nums) {
       int n=nums.length;
        int[] visited = new int[n];
        for(int i=0; i<n; i++){
            int index=Math.abs(nums[i])-1;
            if(visited[index]<0){
                return index+1;                
            }
            else
                visited[index]=-1;
        }
        return 0;
    }
}