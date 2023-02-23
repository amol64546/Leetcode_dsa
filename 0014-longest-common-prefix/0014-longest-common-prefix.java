class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
  
        Arrays.sort(strs);
        String s = strs[0];
        String t = strs[strs.length-1];
             
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i)==t.charAt(i)){
                i++;
            }else{
                break;
            }
        }
           
        
        
        return s.substring(0,i);
    }
}