class Solution {
    public int calculate(String s) {
         Deque<Integer> st = new ArrayDeque<>();
        int n = s.length();
        int sign = 1, ans = 0;
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch)){
                int num = 0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    num = num*10 + (s.charAt(i)-'0');               
                    i++;
                }
                i--;
                ans += sign*num;                
                
            }if(ch=='+'){
                 sign = 1;
            }else if(ch=='-'){
                sign = -1;
            }
            else if(ch=='('){
                st.push(ans);
                st.push(sign);
                sign = 1; ans = 0;
            }else if(ch==')'){
               ans = st.pop()*ans + st.pop();
            }

        }
        
        return ans;
    }
}