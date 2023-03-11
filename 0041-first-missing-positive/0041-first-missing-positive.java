class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        
        int[] map = new int[n+1];
        
        for(int i=0;i<n;i++){
            if(1<=arr[i] && arr[i]<=n)
                map[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(map[i]==0)
                return i;
        }
        return n+1;
    }
}