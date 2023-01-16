class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        
        int n = rowIndex;
        int[] pascal = new int[n+1];
        pascal[0] = 1;
        for(int i=1; i<=n; i++){
            for(int j=i; j>=1; j--){
                pascal[j] += pascal[j-1];
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int val: pascal) list.add(val);        
        return list;
    }
}