class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex+1;
        int[][] pascal = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){                
                if(j==0 || i==j) pascal[i][j] = 1;               
                else pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];                           
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(pascal[n-1][i]);
        }
        return list;
    }
}