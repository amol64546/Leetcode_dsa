/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head == head.next) return true;
        
        ListNode hare = head, tort = head;
        while(hare != null && hare.next != null){
            hare = hare.next.next;
            tort = tort.next;
            if(tort == hare)
                return true;
        }
        return false;
    }
}