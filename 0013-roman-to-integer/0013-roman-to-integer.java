class Solution {
    public int romanToInt(String s) {  
         HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
             if(c=='I') map.put(c,1);
             if(c=='V')  map.put(c,5);
             if(c=='X')  map.put(c,10);
             if(c=='L')  map.put(c,50);
             if(c=='C')  map.put(c,100);
             if(c=='D')  map.put(c,500);
             if(c=='M')  map.put(c,1000);                          
        }
        int last=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int val = map.get(c);
            if(val>last){
                ans+= (val - (2*last)) ;
            }else{
                ans+=val;
            }
            last=val;
        }
        return ans;
    }  
     
   
}