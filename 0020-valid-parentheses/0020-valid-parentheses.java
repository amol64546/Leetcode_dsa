class Solution {
    public boolean isValid(String str) {
           Stack<Character> st = new Stack<>();
        
                 for(int i=0; i<str.length(); i++){
                        char c = str.charAt(i);
                        if(c=='(' || c=='{' || c=='[' ) st.push(c);
                        else{
                                if(!st.empty() && isValid(st.peek())== c)  st.pop();
                                else  return false;                                
                        }
                 }
                
        return st.empty();
        
    }
    
     char isValid(char open){
            if(open=='(' )     return ')';
            if(open=='[')      return ']';                
            return '}';               
    }
}