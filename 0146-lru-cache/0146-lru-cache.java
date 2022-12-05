class Node{
    int key,value;
    Node prev,next;
    Node(){};
    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

//   LRU ------- MRU

class LRUCache {
    Node left, right;
    int cap;
    HashMap<Integer,Node> map;
    public LRUCache(int capacity) {
        this.cap = capacity;
        left = new Node();
        right = new Node();
        left.next = right;
        right.prev = left;
        map = new HashMap<>();
    }
    
    
    public int get(int key) {
        if(map.containsKey(key)){
            remove(map.get(key));
            insertAtRight(map.get(key));
            return  map.get(key).value;
        }else 
           return -1;
    }
    
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        map.put(key, new Node(key,value));
        insertAtRight(map.get(key));
        
        if(map.size()>cap){
            Node lru = left.next;
            remove(lru);
            map.remove(lru.key);
        }
    }
    
    
    public void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        
        prev.next = next;
        next.prev = prev;
    }
    
    
    public void insertAtRight(Node node){
        Node next = right;
        Node prev = right.prev;
        
        node.next = next;
        node.prev = prev;
        prev.next = node;
        next.prev = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */