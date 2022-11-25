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
        
        ListNode x = dummy;
        
        int k = left;
        while(k-->1){
            x = x.next;            
        }
        
        ListNode prev = null, curr = x.next;
        
         k = (right-left+1);
        
        while(k-->0){     
           ListNode temp = curr.next;
            curr.next = prev;
            prev= curr;
            curr = temp; 
        }
        x.next.next = curr;
        x.next = prev;
        
        
        return dummy.next;
    }
}