class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        backtrack(new ArrayList<Integer>(),candidates,0,target);
        return res;
    }
    
    public void backtrack(ArrayList<Integer> list, int[] arr, int start, int target){
       
        if(target<0) return; 
        
        // got one of solutions
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=start; i<arr.length; i++){
            list.add(arr[i]);                      
            backtrack(list,arr,i,target-arr[i]);
            // removing last ele that we have added  // backtrack
            list.remove(list.size()-1); 
        }
    }
}