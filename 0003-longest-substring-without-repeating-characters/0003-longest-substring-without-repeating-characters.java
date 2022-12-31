class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        
        int n = s.length();
        int len=0;
        int i=0, j=0;
        
        while(j<n){
            char c = s.charAt(j);
            
            if(set.contains(c)){               
                while(i<j && c != s.charAt(i)){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
            }
            set.add(c);
            len = Math.max(len,j-i+1);
            j++;
        }
        
        return len;
        
    }
}