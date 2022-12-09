class Solution {
    public String longestCommonPrefix(String[] strs) {
     // if(strs.length==1) return strs[0];
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){   
            String curr = strs[i];        
            while(curr.indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
           
        }
        
        return prefix;
    }
}