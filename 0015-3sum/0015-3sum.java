class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            twoSum(nums,i,mainList);
        }
        return mainList;
    }
     
     public void twoSum(int[] numbers, int i, List<List<Integer>> mainList) {
        int l=i+1, r=numbers.length-1;
        
        while(l<r){
            int sum = numbers[i]+numbers[l]+numbers[r];
            if(sum == 0){
                mainList.add(Arrays.asList(numbers[i],numbers[l],numbers[r]));
                while(l<r && numbers[l]==numbers[l+1]) l++;
                while(l<r && numbers[r]==numbers[r-1]) r--;
                l++;
                r--;
            }else if(sum < 0){
                l++;
            }else{
                r--;
            }
        }
        
    }
}