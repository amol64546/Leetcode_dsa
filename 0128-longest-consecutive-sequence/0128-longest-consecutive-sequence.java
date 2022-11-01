class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i=0; i<n; i++)
            set.add(arr[i]);
        
        for(int i=0; i<n; i++){            
            if(!set.contains(arr[i]-1)){
                int j = arr[i];
                while(set.contains(j))
                    j++;
                ans = Math.max(j-arr[i],ans);
            }            
        }
        return ans;
    }
}