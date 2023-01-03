class Solution {
    public int calPoints(String[] s) {
        int n = s.length;
        Stack<String> st = new Stack<>();
        
        for(int i=0; i<n; i++){
            if(s[i].equals("C")){
                if(!st.empty()){
                    st.pop();
                }
            }
            else if(s[i].equals("D")){
                int top = 2 * Integer.parseInt(st.peek());
                st.push(top + "");
            }
            else if(s[i].equals("+")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.peek());
                int c = a+b;
                st.push(""+a);
                st.push(""+c);
            }
            else{
                st.push(s[i]);
            }            
            
        }
        int ans = 0;
        while(!st.empty()){
            ans += Integer.parseInt(st.pop());
        }
        return ans;
        
    }
}