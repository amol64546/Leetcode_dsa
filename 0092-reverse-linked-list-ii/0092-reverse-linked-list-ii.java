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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head==null || head.next==null || left==right) return head;
        
        ListNode dummy = new ListNode();
        dummy.next = head;        
        ListNode pre = dummy;        
        int k = left;
        while(k-->1)  pre = pre.next;                
        
        ListNode start = pre.next, end = start.next;        
        k = (right-left);        
        while(k-->0){    
            // swap
           start.next = end.next;
            end.next = pre.next;
            pre.next = end;
            end = start.next;           
             
        }       
        
        return dummy.next;
    }
}