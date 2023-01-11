class Solution {
    
        List<List<Integer>> mainList = new ArrayList<>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        
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
        combination(list,arr,i+1,target-arr[i]);        
        list.remove(list.size()-1); 
        i++;
        while(i<arr.length && arr[i]==arr[i-1]) i++;
        
        combination(list,arr,i,target);   
        
        
        
    }
    
}