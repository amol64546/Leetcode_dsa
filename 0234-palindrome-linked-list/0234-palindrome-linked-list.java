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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = getMid(head);
        ListNode head2 = reverse(mid);
        
        while(head2!=null && head!=null){
            if(head2.val != head.val) return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
    
    public ListNode getMid(ListNode node){
        ListNode slow=node, fast=node;
        ListNode prev = node;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
           
        }
        
        prev.next = null;
        return slow;        
        
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev=null, curr=head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}