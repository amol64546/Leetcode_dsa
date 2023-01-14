
class Solution {
    
     List<List<Integer>>  mainList;
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        mainList = new ArrayList<>();    
	
		Arrays.sort(nums);
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
        
        while(i<nums.length-1 && nums[i]==nums[i+1]) i++;
        
        combination(nums,i+1,list);
    }
}