class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int  sum=0, rem=0, count=0;
      
        for(int i: arr){
             sum+=(i%k+k)%k;  
              rem=sum%k;          
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
                if(map.containsKey(0))
                    count=map.get(0);
                for(int i: map.values()){
                        count+= i*(i-1)/2;
                }
        return count;
             
    }
}