class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int[][] memo = new int[triangle.size()][triangle.size()];
        for(int[] arr:memo) Arrays.fill(arr,(int)1e5);
        return memo(triangle,0,0,memo);
        // return tabulation(triangle);
    }
    
    
    public static int memo(List<List<Integer>> a,int i,int j,int[][] memo){
        int m = a.size(), n = i+1;
        if(i==m-1) return a.get(i).get(j);
        if(memo[i][j] != (int) 1e5) return memo[i][j];
        int left = memo(a,i+1,j,memo);
        int right = memo(a,i+1,j+1,memo);
        return memo[i][j] = Math.min(left,right) + a.get(i).get(j);
    }
    
    
    public static int tabulation(List<List<Integer>> a){
		
		for(int i=a.size()-1; i>=0; i--){
			for(int j=i; j>=0; j--){
				if(i==a.size()-1) continue;
				int left = a.get(i+1).get(j+1) ;
				int right = a.get(i+1).get(j) ;		
				int ans = a.get(i).get(j) + Math.min(left,right);		
                a.get(i).set(j,ans);
			}
		}
		return a.get(0).get(0);
	}
}