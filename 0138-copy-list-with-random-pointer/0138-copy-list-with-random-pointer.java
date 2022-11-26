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
    public Node copyRandomList(Node head) {       
        if(head==null) return null;   
      Node curr = head;
      while(curr!=null){          
         Node temp = curr.next;
          curr.next = new Node(curr.val);
          curr.next.next = temp;
          curr =temp;
      }
      curr = head;
      while(curr!=null){
         curr.next.random = (curr.random==null) ? null:curr.random.next;
         curr=curr.next.next;
      }

      Node orig=head, copy=head.next; head=copy;
      while(orig!=null){
          orig.next=orig.next.next;
          copy.next=(copy.next==null)? null:copy.next.next;
          orig=orig.next;
          copy=copy.next;
      }
      return head;
    }
}