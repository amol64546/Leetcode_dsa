class Solution {  
    public List<List<Integer>> pacificAtlantic(int[][] heights) {              
         int r = heights.length, c = heights[0].length;   
        boolean[][] pacific = new boolean[r][c];
        boolean[][] atlantic = new boolean[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i==0 || j==0)
                    DFS(heights,i,j,pacific,0);
                if(i==r-1 || j==c-1)
                    DFS(heights,i,j,atlantic,0);              
                   
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(pacific[i][j] && atlantic[i][j])
                    list.add(Arrays.asList(i,j));
            }
        }
        return list;
    }

      
     public void DFS(int[][] heights, int r, int c,boolean[][] ocean,int prev){        
        if(r<0 || c<0 || r>=heights.length || c>=heights[0].length)  return;              
        if(ocean[r][c])   return;         
        if(heights[r][c]< prev) return;
         
         ocean[r][c] = true;
                
            DFS(heights,r+1,c,ocean,heights[r][c]);
            DFS(heights,r-1,c,ocean,heights[r][c]);     
            DFS(heights,r,c+1,ocean,heights[r][c]);
            DFS(heights,r,c-1,ocean,heights[r][c]);            
            
     }
    
  
}