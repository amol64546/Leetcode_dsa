class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        for(String ss: wordDict){
            set.add(ss);
        }
       List<List<String>> dp = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            List<String> list = new ArrayList<>();
            for(int j=i; j>=0; j--){
               String ss = s.substring(j,i+1);
                if(set.contains(ss)){
                    if(j==0){
                        //System.out.println((j-1)+""+dp.get(j-1));
                        list.add(ss+(i==s.length()-1?"":" "));
                    }else{
                        
                        for(String ps: dp.get(j-1))
                            list.add(ps+ss+(i==s.length()-1?"":" "));                        
                    }
                }
            }
            dp.add(list);
        }
        //System.out.println(dp);
        return dp.get(dp.size()-1);
        
    }
}