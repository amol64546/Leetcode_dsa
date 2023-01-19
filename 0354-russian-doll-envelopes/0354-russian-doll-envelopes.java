class Solution {
    
    static int lis(int[][] arr, int n){
		int[] dp = new int[n];
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i=0; i<n; i++){
			Integer top = ts.ceiling(arr[i][1]);
			if(top!=null) ts.remove(top);
			ts.add(arr[i][1]);
			dp[i] = ts.size();
		}
		return dp[n-1];
	}
    
    public int maxEnvelopes(int[][] arr) {
        Arrays.sort(arr,(a,b)->{
			if(a[0]==b[0]) return b[1]-a[1];
			return a[0]-b[0];
		});
		return lis(arr,arr.length);
    }
}