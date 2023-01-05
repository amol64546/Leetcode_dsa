class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
		PriorityQueue<Pair> q = new PriorityQueue<>(Collections.reverseOrder());
        
		for(int i=0; i<arr.length; i++){
			q.offer(new Pair(Math.abs(arr[i]-x), arr[i]));
            if(q.size()>k) q.poll();
		}
        
		List<Integer> ans = new ArrayList<>();
        
		while(!q.isEmpty()){
			ans.add(q.poll().val);
		}
        Collections.sort(ans);
		return ans;
    }
    
    
    class Pair implements Comparable<Pair>{
		int diff, val;
		Pair(int diff,int val){
			this.diff = diff;
			this.val = val;
		}
        
        public int compareTo(Pair that){
            if(this.diff==that.diff)
                return this.val - that.val;
            
            return this.diff - that.diff;
        }
	}
}