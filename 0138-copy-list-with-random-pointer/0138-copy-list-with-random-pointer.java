/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node,Node> map = new HashMap<>();     
    Node add(Node head){        
        Node dummy = new Node(0);
        Node temp = dummy;
         while(head!=null){                     
            temp.next = new Node(head.val);
            temp = temp.next;
            map.put(head,temp);
            head=head.next;
        }              
        return dummy.next;
    }
    void setRandom(Node temp, Node head){
        while(head!=null){
            temp.random = map.get(head.random);
            temp=temp.next;
            head=head.next;
        }
        
    }
    public Node copyRandomList(Node head) {       
       Node newHead = add(head);           
        setRandom(newHead,head);  
        return newHead;
    }
}