class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        return solve(arr,k)-solve(arr,k-1);
    }
    
    public int solve(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();        
        int i=0, j=0, count=0;
        while(j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            while(map.size()>k){
                int val = arr[i];
                map.put(val,map.get(val)-1);
                if(map.get(val)==0){
                    map.remove(val);                    
                }
                i++;
                
            }
            count+=j-i+1;
            j++;
                 
        }
        return count;
    }
}