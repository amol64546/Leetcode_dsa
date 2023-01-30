class Pair{
    int val,min;
    Pair(int val,int min){
        this.val=val;
        this.min = min;
    }
}
class MinStack {
    Stack<Pair> st;
   
    
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.size()==0) st.push(new Pair(val,val));
        else st.push(new Pair(val,Math.min(val,this.getMin())));
       
    }
    
    public void pop() {
        if(st.size()>0) st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
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