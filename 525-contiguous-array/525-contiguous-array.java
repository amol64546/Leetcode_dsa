class Solution {
    public int findMaxLength(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==0)
                arr[i]=-1;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen=0, sum=0;
        map.put(0,-1);
        for(int i=0; i<n; i++){
            sum+=arr[i];
            
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return maxLen;
        
    }
}