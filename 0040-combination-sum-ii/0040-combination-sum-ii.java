class Solution {
    
    ArrayList<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        
        backtrack(new ArrayList<Integer>(),candidates,target,0);
        return res;
    }
    
    public void backtrack(ArrayList<Integer> list,int[] arr, int k, int rejected){
        if(k<0) return;
        if(k==0){
            res.add(new ArrayList(list));
            return;
        }
        
        for(int i=rejected; i<arr.length; i++){
            if (i > rejected && arr[i] == arr[i-1]) continue;
            list.add(arr[i]);
            backtrack(list,arr,k-arr[i],i+1);
            list.remove(list.size()-1);
        }
    }
}