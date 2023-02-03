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
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy, curr = head;
        for(int i=0; i<left-1; i++){
            prev = curr;
            curr = curr.next;
        }
        ListNode prevPart = prev;
        
        // reverse
        int n = right-left+1;
        for(int i=0; i<n; i++){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        prevPart.next.next = curr;
        prevPart.next = prev;
        return dummy.next;
    }
}