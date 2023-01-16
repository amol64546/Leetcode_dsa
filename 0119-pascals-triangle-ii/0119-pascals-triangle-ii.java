class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        recur(rowIndex,list);
        return list;
    }
    
    public void recur(int r,List<Integer> list){
        if(r==0){
            list.add(1);
            return;
        }
         recur(r-1,list);
        for(int i=list.size()-1;i>=1; i--){
            int val = list.get(i-1)+list.get(i);
            list.set(i,val);
        }               
        list.add(1);
    }
}