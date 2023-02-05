class Solution {
    List<List<Integer>> mainList = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        permutation(nums,vis,list);
        return mainList;
    }
    
    public void permutation(int[] arr, boolean[] vis, List<Integer> list){
        
        if(list.size()==arr.length){
            mainList.add(new ArrayList<>(list));
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(vis[i]) continue;
            vis[i] = true;
            list.add(arr[i]);
            permutation(arr,vis,list);
            list.remove(list.size()-1);
            vis[i] = false;
        }
    }
}