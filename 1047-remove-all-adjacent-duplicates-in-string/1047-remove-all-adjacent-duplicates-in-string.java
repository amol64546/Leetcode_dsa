class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);        
        int i=0;
        for(int j=0; j<s.length(); j++, i++){
            sb.setCharAt(i,sb.charAt(j));
            if(i>0 && sb.charAt(i)==sb.charAt(i-1))
                i-=2;
        }
        return sb.substring(0,i);
        

    }
}