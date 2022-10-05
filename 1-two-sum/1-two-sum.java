class Solution {
    public int[] twoSum(int[] arr, int target) {
     
        int n = arr.length;
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            int val=target-arr[i];
            if(!map.containsKey(val)){
                map.put(arr[i],i);
            }else{
                ans[0]=map.get(val);
                ans[1]=i;
                break;
            }
        }
         
               return ans;
       
    }
}