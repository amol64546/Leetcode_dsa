class MyHashSet {
    Node head,tail;
    public MyHashSet() {
        
    }
    
    public void add(int key) {        
              
        if(contains(key)) return;
        
        Node node = new Node(key);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next = node;
        tail=node;
    }
    
    public void remove(int key) {
        if(head==null) return;
        
        if(head.val==key){
            if(head.next==null)
                tail=null;
            head=head.next;
                    
        }
     
        
        Node curr=head;       
        while(curr.next!=null){
            if(curr.next.val==key){   
                if(curr.next==tail)
                    tail=curr;
                curr.next = curr.next.next;                    
            }else{                
                curr=curr.next;
            }           
           
        }
    }
    
    public boolean contains(int key) {
        if(head==null) return false;
        Node curr=head;
        while(curr!=null){
            if(curr.val==key)
                return true;
            curr=curr.next;
        }
        return false;
    }
}
class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val=val;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */