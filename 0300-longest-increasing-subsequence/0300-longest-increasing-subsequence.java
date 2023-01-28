class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        TreeSet<Integer> ts = new TreeSet<>();
        
		for(int i=0; i<n; i++){
            Integer ceil = ts.ceiling(arr[i]);
            if(ceil!=null) ts.remove(ceil);
			ts.add(arr[i]);
		}
        return ts.size();
		

       
    }
}