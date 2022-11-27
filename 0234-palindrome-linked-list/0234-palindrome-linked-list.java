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
    public ListNode getMid(ListNode temp){
        ListNode fast=temp, slow=temp;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;           
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null, curr=head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
        
        
    }   
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null) return true;
        
        ListNode mid = getMid(head);
        ListNode right = reverse(mid), left=head;
        
        while(left!=null && right!=null){
            if(left.val!=right.val)
                return false;
            left=left.next;
            right=right.next;
        }
        return true;
        
        
    }
}