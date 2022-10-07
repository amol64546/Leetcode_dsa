class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       
        List ans = new ArrayList();
        HashMap<Character,Integer> mp = new HashMap<>();
        HashMap<Character,Integer> ms = new HashMap<>();
        
         int slen = s.length();
        int plen = p.length();
        if(plen>slen) return ans;       
        
        int l=0,r=0;
       while(r<plen){          
            mp.put(p.charAt(r),mp.getOrDefault(p.charAt(r),0)+1);
            ms.put(s.charAt(r),ms.getOrDefault(s.charAt(r++),0)+1);
        } 
        if(mp.equals(ms))  ans.add(l);          
     
        while(r<slen)  { 
            ms.put(s.charAt(r),ms.getOrDefault(s.charAt(r++),0)+1);
            
            char c = s.charAt(l++);
            ms.put(c,ms.get(c)-1);  
            if(ms.get(c)==0)
                ms.remove(c);
           
             if(mp.equals(ms))  ans.add(l);            
          
        }
        return ans;
        
    }
}