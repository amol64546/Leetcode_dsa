class Solution {
    public boolean isValid(String str) {
           Stack<Character> st = new Stack<>();
                 for(int i=0; i<str.length(); i++){
                        char c = str.charAt(i);
                        if(c=='(' || c=='{' || c=='[' ){
                                st.push(c);
                        }else{
                            if(st.empty() || Math.abs(c-st.pop())>2) 
                                return false;
                        }
                }
               
        return st.empty();
    }
    
     
}