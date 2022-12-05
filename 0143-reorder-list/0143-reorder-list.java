/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode head2 = helper(head);
      
        ListNode temp = head;
        
        while(head!=null && head2!=null){
            if(head!=null){
                temp = head.next;
               head.next = head2;
                head = temp;                
            }
            if(head2!=null){
                temp = head2.next;
               head2.next=head;
                head2 = temp;      
            }         
                    
        }
    }
    
    public ListNode helper(ListNode head){
        ListNode  slow=head, fast=head.next;
        while(fast!=null && fast.next!=null){            
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode temp=slow.next;
        slow.next=null;
        
        ListNode prev=null, curr=temp;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
        return prev;
        
    }
}