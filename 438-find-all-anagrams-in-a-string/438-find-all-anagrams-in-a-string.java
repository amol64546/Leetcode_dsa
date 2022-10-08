class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       
        List ans = new ArrayList();
        int[] mp = new int[26];
        int[] ms = new int[26];
        
         int slen = s.length();
        int window = p.length();
        if(window>slen) return ans;       
        
        int l=0,r=-1;
        while(++r<window){          
            mp[p.charAt(r)-'a']++;
            ms[s.charAt(r)-'a']++;
        } 
        
        if(isEqual(mp,ms))   
            ans.add(l);     
          
     
        while(r<slen)  {          
            ms[s.charAt(r++)-'a']++;
                       
            
            ms[s.charAt(l++)-'a']--;             
             
            
            if(isEqual(mp,ms))   
                ans.add(l);           
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