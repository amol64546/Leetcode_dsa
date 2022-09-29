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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode curr = head;
        // size
        int size=0;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        
        
        
        if(size==n) return head.next;
        
        ListNode prev = head;
        int prevPos = size-n;
        int currPos = 1;       
        
        while(currPos++<prevPos){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}