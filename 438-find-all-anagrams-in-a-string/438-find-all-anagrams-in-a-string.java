class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       
        List ans = new ArrayList();
        int[] mp = new int[26];
        int[] ms = new int[26];
        
         int slen = s.length();
        int plen = p.length();
        if(plen>slen) return ans;       
        
       
        for(int i=0;i<plen; i++){          
            mp[p.charAt(i)-'a']++;
            ms[s.charAt(i)-'a']++;
        }         
        if(isEqual(mp,ms))   
            ans.add(0);            
     
        for(int i=plen;i<slen; i++){  
            ms[s.charAt(i)-'a']++;      // add  
            ms[s.charAt(i-plen)-'a']--; // remove                                
            if(isEqual(mp,ms))          // compare
                ans.add(i-plen+1);            
        }
        return ans;
        
    }
    
    private boolean isEqual(int[] mp,int[] ms){
        for(int i=0;i<26; i++){
            if(mp[i]!=ms[i])
                return false;
        }
        return true;
    }
}