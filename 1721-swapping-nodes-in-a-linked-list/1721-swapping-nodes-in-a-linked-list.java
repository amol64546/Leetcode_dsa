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
    public ListNode swapNodes(ListNode head, int k) {
         if(head==null || head.next==null) return head;
         ListNode dummy = new ListNode();
         dummy.next = head;
        ListNode prev1=dummy, curr1=head;
        while(k-->1){
            prev1=curr1;
            curr1=curr1.next;
        }

        ListNode temp=dummy, curr=curr1;
        ListNode prev2=dummy, curr2=dummy.next;
        while(curr.next!=null){
            prev2=curr2;
            curr2=curr2.next;
            curr=curr.next;
        }
         // swap		
        prev1.next = curr2;  		
        prev2.next = curr1;                            
         temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;
		
		return dummy.next;
    }
}