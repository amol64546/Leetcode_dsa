class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        int minCount=Integer.MAX_VALUE;
        for(int i=0; i<strs.length-1; i++){
            int count=0, j=0;
            while(j<strs[i].length() && j<strs[i+1].length()){
                if(strs[i].charAt(j)==strs[i+1].charAt(j)){
                    count++;
                }else{
                    break;
                }
                j++;
            }
            minCount = Math.min(count,minCount);
        }
        
        return strs[0].substring(0,minCount);
    }
}