class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        
        if(arr.length==0 || arr == null)
            return new ArrayList<>();
        
        HashMap<String,List<String>> map = new HashMap<>();        
        for(String s: arr){ 
            String key = getKey(s);
            if(!map.containsKey(key))
                map.put(key,new ArrayList<>());
            map.get(key).add(s);                
        }
        
        return new ArrayList<>(map.values());
        
    }
    
    public String getKey(String s){      
        char ca[] = s.toCharArray();
        Arrays.sort(ca);
        String key = String.valueOf(ca);
        return key;
    
    }
}