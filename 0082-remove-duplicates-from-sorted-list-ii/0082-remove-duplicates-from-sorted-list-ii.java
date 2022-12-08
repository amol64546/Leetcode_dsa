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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode first = dummy, second=head;
        while(second!=null){
            while(second.next!=null && second.val==second.next.val){
                second = second.next;
            }
            if(first.next!=second){
                first.next = second.next;
            }else{
                first = first.next;
            }
            second = second.next;
        }
        return dummy.next;
    }
}