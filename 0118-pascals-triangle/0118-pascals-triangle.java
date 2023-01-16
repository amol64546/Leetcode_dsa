class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numRows; i++){           
            list.add(0,1);
            for(int j=1; j<list.size()-1; j++){
                int k = list.get(j)+ list.get(j+1);
                list.set(j, k);
            }
            
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}