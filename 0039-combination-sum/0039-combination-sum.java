class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        backtrack(new ArrayList<>(),candidates,0,target);
        return res;
    }
    
    public void backtrack(ArrayList list, int[] arr, int rejected, int target){
        // backtrack
        if(target<0) return; 
        
        // got one of solutions
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=rejected; i<arr.length; i++){
            list.add(arr[i]);
            backtrack(list,arr,i,target-arr[i]);
            list.remove(list.size()-1); // removing last ele that we have added
        }
    }
}