class Solution {
     List<List<Integer>>  mainList = new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
         List<Integer> list = new ArrayList<>();        
        combination(1,k,n,list);
        return mainList;
    }

    public void combination(int i,int k,int n,List<Integer> list){
        if(k==0){
            mainList.add(new ArrayList<>(list));
            return;
        }
        if(i>n || k<0) return;
        
        list.add(i);
        combination(i+1,k-1,n,list);
        list.remove(list.size()-1);
                    
        combination(i+1,k,n,list);
        
    }
}
