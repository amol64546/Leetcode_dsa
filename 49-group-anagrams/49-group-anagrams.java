class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        
        if(arr.length==0 || arr == null)
            return new ArrayList<>();
        
        HashMap<String,List<String>> map = new HashMap<>();        
        for(String s: arr){            
            char[] ca = new char[26];
            for(char c: s.toCharArray())
                ca[c-'a']++;
            String str = String.valueOf(ca);
            
            if(!map.containsKey(str))
                map.put(str,new ArrayList<>());
            map.get(str).add(s);                
        }
        
        return new ArrayList<>(map.values());
    }
}