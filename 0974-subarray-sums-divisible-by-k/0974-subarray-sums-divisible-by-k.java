class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        
        int n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0, sum=0;
        // map.put(0,1);
        for(int i: arr){
             sum = (sum + i % k+ k) % k;   
             if(sum==0)
                count++;
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
           
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
             
    }
}