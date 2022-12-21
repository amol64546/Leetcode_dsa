class Solution {
    
    public void DFS(int[][] image, int sr, int sc, int color, int initColor){
        if(sr<0 || sr>=image.length) return;
            
        if(sc<0 || sc>=image[0].length) return;
        
        if(image[sr][sc] != initColor) return;
        
        image[sr][sc] = color;
        
        DFS(image,sr+1,sc,color,initColor);
        DFS(image,sr-1,sc,color,initColor);
        DFS(image,sr,sc+1,color,initColor);
        DFS(image,sr,sc-1,color,initColor);
        
        
        
        
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc]== color) return image;        
        
        DFS(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}