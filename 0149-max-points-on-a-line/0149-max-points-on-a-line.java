class Solution {
    public int maxPoints(int[][] p) {
        
        int n = p.length;
        if(n<=2) return n;
        
        int ans = 2;
        
        
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int count=2;
                for(int k=j+1;k<n;k++){
                    
                    // picking 3 points at a time
                    int[] x = p[i];
                    int[] y = p[j];
                    int[] z = p[k];

                    // compare slope(x-y) ans slope(y-z)
                    int val1 = (y[1]-x[1])*(z[0]-y[0]);
                    int val2 = (z[1]-y[1])*(y[0]-x[0]);
                    if(val1==val2) count++;
                    
                }
                ans = Math.max(ans,count);                
            }
        }
           
            
        
        return ans;
            
    }
}