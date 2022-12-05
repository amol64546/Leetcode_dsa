class MinStack {
    Stack<Pair<Integer,Integer>> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        Pair<Integer,Integer> p;
        if(st.empty()){
            p = new Pair<>(val,val);
        }else{
            p = new Pair<>(val,Math.min(this.getMin(),val));
        }
        st.push(p);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().getKey();
    }
    
    public int getMin() {
        return st.peek().getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */