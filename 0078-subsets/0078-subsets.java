class Solution {
    
     List<List<Integer>>  mainList;
    
    public List<List<Integer>> subsets(int[] nums) {
        mainList = new ArrayList<>();    
	
		
        combination(nums,0,new ArrayList<>());
        return mainList;
    }
    
    public void combination(int[] nums,int i,ArrayList<Integer> list){
        
        if(i == nums.length){
            mainList.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        combination(nums,i+1,list);
        list.remove(list.size()-1);
        
        combination(nums,i+1,list);
    }
}