class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] time = new int[1001];
		for(int[] t: trips){
			int passenger = t[0];
			int from = t[1];
			int to = t[2];
			time[from] += passenger;
			time[to] -= passenger;			
		}

		for(int val: time){
			capacity -= val;
			if(capacity<0) return false;
		}
		return true;
    }
}