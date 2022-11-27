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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode groupPrev = dummy, curr=head;
        int n=0;        
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        while(n>=k){           
            // reverse k group
            ListNode prev = null, temp=null; curr = groupPrev.next ;
            for(int i=0; i<k; i++){
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }            
            groupPrev.next.next = curr;
            temp = groupPrev.next;
            groupPrev.next = prev;
            groupPrev = temp;
            n -= k;
        }
        return dummy.next;
    }
}