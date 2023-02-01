class MedianFinder {
    Queue<Integer> max;
     Queue<Integer> min;
    
    public MedianFinder() {
        max = new PriorityQueue<>(Collections.reverseOrder());
        min = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(max.size()==0 || max.peek()>num) max.offer(num);
        else min.offer(num);
        balance();
    }
    
    public double findMedian() {
        if(max.size()==min.size()) return 1.0*(max.peek()+min.peek())/2.0;
        else if(max.size()>min.size()) return 1.0*max.peek();
        return 1.0*min.peek();
    }
    
    public void balance(){
        if(Math.abs(max.size()-min.size())<=1) return; // balanced
        if(max.size()>min.size()) min.offer(max.poll());
        else max.offer(min.poll());
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */