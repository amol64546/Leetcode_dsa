class MyQueue {
    Stack<Integer> s1,s2;
    int val;
    public MyQueue() {
        s1= new Stack<>();
        s2= new Stack<>();
    }
    
    public void push(int x) {
        if(s1.empty()){
            val = x;
        }
        s1.push(x);
    }
    
    public int pop() {
        if(s2.empty()){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    public int peek() {
       if(!s2.empty())
           return s2.peek();
        return val;
    }
    
    public boolean empty() {
        return (s1.empty() && s2.empty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */