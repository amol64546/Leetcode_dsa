class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        boolean flag=false;
        int sum=0;
        for(int i: map.values()){
            if(i%2==0){
                sum+=i;
            }else{
                flag=true;
                sum+=(i-1);
            }
        }
        
        if(flag) sum++;
        return sum;
    }
}