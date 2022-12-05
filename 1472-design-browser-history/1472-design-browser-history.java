class BrowserHistory {
    Stack<String> st;
    Stack<String> aux;

    public BrowserHistory(String homepage) {
        st = new Stack<>();
        st.push(homepage);
        aux = new Stack<>();
    }
    
    public void visit(String url) {
        st.push(url);
        aux.clear();
    }
    
    public String back(int steps) {
       for(int i=0; i<steps; i++){
            if(st.size()==1) break;
            aux.push(st.pop());            
        }
        return st.peek();
        
    }
    
    public String forward(int steps) {
        while(!aux.empty() && steps-->0){  
            st.push(aux.pop());
                       
        }
        return st.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */