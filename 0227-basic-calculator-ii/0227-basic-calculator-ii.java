class Solution {
    public int calculate(String s) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = s.length();
        char sign = '+';
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch)){
                int num = 0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    num = num*10 + (s.charAt(i)-'0');               
                    i++;
                }
                i--;
                
                if(sign=='+'){
                    st.push(+num);
                }else if(sign=='-'){
                    st.push(-num);
                }else if(sign=='*'){           
                    st.push(st.pop()*num);
                }else{
                    st.push(st.pop()/num);
                }
                
            }else if(ch!=' '){
                sign = ch;
            }
           
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
  
}