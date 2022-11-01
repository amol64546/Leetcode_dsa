class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
         int sum=0,rem=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            rem=sum%k;
            if(rem==0 && i>0 )
                return true;
            if(map.containsKey(rem) && i-map.get(rem)>1)
                return true;
            if(!map.containsKey(rem))
                map.put(rem,i);
        }
        return false;
    }
}