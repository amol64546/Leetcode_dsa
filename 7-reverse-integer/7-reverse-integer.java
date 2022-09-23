class Solution {
    public int reverse(int n) {
        
        int flag = n<0 ? -1:1;
        n = n*flag;
        
        Stack<Integer> st = new Stack<>();
             while(n>0){
                  st.push(n%10);
                   n/=10;
              }
               
               
         long r=0;
         long i=1;
        while(!st.empty()){
            r = r + st.pop() * i; 
            i*=10;
        }
        
        if(r<=Integer.MIN_VALUE || r>=Integer.MAX_VALUE)
            return 0;
            
            
       return (int)r*flag;
    }
}