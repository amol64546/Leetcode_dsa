class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] map = new int[n+1];
        
        for(int[] a: trust){
            map[a[0]]--;
            map[a[1]]++;
        }
        
        
        for(int i=1;i<=n;i++){
            if(map[i]==n-1) return i;
        }
        return -1;
    }
}