class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        int i=0;
        while(i < asteroids.length){
            int curr = asteroids[i];
            if(st.empty()){
                st.push(curr);
                i++;
                continue;
            }
            
            int last = st.peek();
            if(last>0 && curr<0){  // collision
                if(Math.abs(curr)==last){    // both destroyed
                    st.pop();
                    i++;
                }else if(Math.abs(curr)>last){   // last destroyed
                    st.pop();
                }else{   // curr destroyed
                    i++;
                }
            }else{  // no collision
                st.push(curr);
                i++;
            }
        }
        int[] ans = new int[st.size()];
        for(i=st.size()-1; i>=0; i--)
            ans[i] = st.pop();
        return ans;
    }
}