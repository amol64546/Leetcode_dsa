class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int n = s1.length;
        int m = s2.length;
        
        for(int i=0; i<Math.max(m,n); i++){
            int a,b;
            
            if(i>=n) a = 0;
            else a = Integer.parseInt(s1[i]);
            
            if(i>=m) b = 0;
            else b = Integer.parseInt(s2[i]);
            
            if(a<b) return -1;
            if(a>b) return 1;
        }
        return 0;
        
    }
}