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
        ListNode groupPrev = dummy;        
        int k = left;
        while(k-->1)  
            groupPrev = groupPrev.next;                

         k = (right-left+1);
        ListNode prev = null, curr = groupPrev.next;
        while(k-->0){     
           ListNode temp = curr.next;
            curr.next = prev;
            prev= curr;
            curr = temp; 
        }   
        
        groupPrev.next.next = curr;
        groupPrev.next = prev;
        
        return dummy.next;
    }
}

        
        
       