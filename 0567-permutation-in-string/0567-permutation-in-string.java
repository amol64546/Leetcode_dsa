class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(),  n = s2.length();
        if(m>n) return false;
        if(s1.equals(s2)) return true;
        int[] s1map = new int[26];
        int[] s2map = new int[26];
       
        for(int i=0; i<m; i++){
            s1map[s1.charAt(i)-'a']++;
            s2map[s2.charAt(i)-'a']++;
        }
        
         for(int i=m; i<n; i++){
             if(Arrays.equals(s1map,s2map))
                 return true;
             // slide window
             s2map[s2.charAt(i)-'a']++;
             s2map[s2.charAt(i-m)-'a']--;
         }

        return  Arrays.equals(s1map,s2map); // for last window
        
    }
}