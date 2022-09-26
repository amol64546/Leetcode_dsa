class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {       
        
        int n = mat.length;
        
        
        for(int k=0; k<=3; k++){
                   
           if(isSame(mat,target,n))
               return true;
           rotate(mat, n);  
        }
        
        return false;
        
    }
    
    public static boolean isSame(int[][] mat, int[][] target, int n){
        for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                if(mat[i][j]!=target[i][j])
                    return false;
             }
           }
        return true;
    }
    
    public static void rotate(int[][] mat, int n){
         // inplace transpose        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        // swap col,         
          for(int[] arr:mat){
            for(int j=0, k=n-1; j<k; j++, k--){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
            }
         }
    }
      
}