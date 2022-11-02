class Solution {
   public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";     
                                   
       HashMap<Character,Integer> map = new HashMap<>();
       for(char c: t.toCharArray())
           map.put(c,map.getOrDefault(c,0)+1);
       
      
       int si=0;
       int min=Integer.MAX_VALUE;
       char key;    
       int matched=0;
       int i=0,j=-1;
      while(++j<s.length()){                         
            // add
           key = s.charAt(j);
            if(map.containsKey(key)){
                map.put(key,map.get(key)-1);
                if(map.get(key)==0)  matched++;
            }
               
             // remove           
             while(matched==map.size()){
                 if((j-i+1)<min){
                     min = j-i+1;
                     si = i;
                 }
                 key = s.charAt(i++);
                 if(map.containsKey(key)){
                     if(map.get(key)==0) matched--;
                     map.put(key,map.get(key)+1);
                     
                 }
             }
                         
       
       }
               
      return (min==Integer.MAX_VALUE) ? "" : s.substring(si,si+min);
               
    
  }
    
}