class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (int[] a, int[] b) -> {                
                return a[0]-b[0];          
         });
        
        List<int[]> list = new ArrayList<>();
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int[] arr: intervals){
            if(arr[0]<=end){
                end = Math.max(end,arr[1]);
            }else{
                list.add(new int[]{start,end});
                start = arr[0];
                end = arr[1];
            }
        }
        list.add(new int[]{start,end});
        int n = list.size();
        int[][] ans = new int[n][2];
        
        for(int i=0; i<n; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}