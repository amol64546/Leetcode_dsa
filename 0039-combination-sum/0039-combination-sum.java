class Solution {
    List<List<Integer>> mainList = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        combination(new ArrayList<Integer>(),candidates,0,target);
        return mainList;
    }
    
    public void combination(ArrayList<Integer> list, int[] arr, int i, int target){       
        if(target==0){
            mainList.add(new ArrayList<>(list));
            return;
        } 
        if(target<0 || i==arr.length) return; 
        
        list.add(arr[i]);                      
        combination(list,arr,i,target-arr[i]);        
        list.remove(list.size()-1); 
        
        combination(list,arr,i+1,target);   
        
        
        
    }
}