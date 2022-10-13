class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }else{
                if(!st.empty() && isValid(st.peek(),c)){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.empty();
    }
    
    public boolean isValid(char open,char close){
        if(open=='(' && close==')')
            return true;
        if(open=='[' && close==']')
            return true;
        if(open=='{' && close=='}')
            return true;
        return false;
    }
}