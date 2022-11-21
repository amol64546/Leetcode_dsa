class Solution {
    
    ArrayList<List<Integer>> res = new ArrayList<>();
     public List<List<Integer>> combinationSum3(int k, int n) {
       int[] arr = {1,2,3,4,5,6,7,8,9};
        
        backtrack(new ArrayList<Integer>(),arr,k,n,0);
        return res;
    }
    
    public void backtrack(ArrayList<Integer> list,int[] arr,int k, int n, int rejected){
        if(n<0) return;
        if(n==0){
            if(list.size()==k)
                res.add(new ArrayList(list));
            return;
        }
        
        for(int i=rejected; i<arr.length; i++){
            if (i > rejected && arr[i] == arr[i-1]) continue;
            list.add(arr[i]);
            backtrack(list,arr,k,n-arr[i],i+1);
            list.remove(list.size()-1);
        }
    }
}