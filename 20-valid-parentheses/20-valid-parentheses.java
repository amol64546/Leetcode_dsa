class Solution {
    public boolean isValid(String str) {
           Stack<Character> st = new Stack<>();
                 for(int i=0; i<str.length(); i++){
                        char c = str.charAt(i);
                        if(c=='(' || c=='{' || c=='[' ){
                                st.push(c);
                        }else{
                                if(!st.empty() && isMatch(st.peek(), c)){
                                        st.pop();
                                }else{
                                     return false;
                                }
                        }
                }
                if(st.empty()){
                        return true;
                }
        return false;
    }
    
     boolean isMatch(char open, char close){
                if(open=='(' && close==')')
                        return true;
                if(open=='[' && close==']')
                        return true;
                if(open=='{' && close=='}')
                        return true;

                return false;
        }
}