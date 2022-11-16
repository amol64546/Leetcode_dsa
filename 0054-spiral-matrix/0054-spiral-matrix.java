class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List ans = new ArrayList();
        int c1=0, r1=0, c2=matrix[0].length, r2=matrix.length;
       
        while(c1<c2 && r1<r2){           
                for(int i=c1; i<c2; i++)
                    ans.add(matrix[r1][i]);                            
                r1++;
          
                for(int i=r1; i<r2; i++)
                   ans.add(matrix[i][c2-1]);                               
                c2--;
            
            if(r1<r2)        
                for(int i=c2-1; i>=c1; i--)
                    ans.add(matrix[r2-1][i]);                               
                r2--;
            
            if(c1<c2)
                for(int i=r2-1; i>=r1; i--)
                    ans.add(matrix[i][c1]);                        
                c1++;            
        }
        return ans;
    }
}