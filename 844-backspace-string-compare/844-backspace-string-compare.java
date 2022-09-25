class Solution {
    public boolean backspaceCompare(String s, String t) {
        
      return stackSolution(s).equals(stackSolution(t));       
 
    }
    
    public String stackSolution(String str){
        Stack<Character> st = new Stack<>();
        
        for(char c: str.toCharArray()){
            if(c !='#'){
                st.push(c);
            }else if(!st.empty()){
                st.pop();
            }
        }
        
        return st.toString();
    }
    
    
    
}