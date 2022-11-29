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
          int s=k;
        int n = 0;
        ListNode curr=head;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int e=n-k+1;                         
        if(s==e)  return head;    // both nodes are same
    ListNode dummy = new ListNode(0);
	dummy.next = head;
	
     // traverse
        ListNode prev1=dummy, curr1=head;
        while(s-->1){
          prev1=curr1;
          curr1=curr1.next;
        }       
        ListNode prev2=dummy, curr2=head;
        while(e-->1){
            prev2=curr2;
            curr2=curr2.next;
        }
		
         // swap		
        prev1.next = curr2;  		
        prev2.next = curr1;                            
        ListNode temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;
		
		return dummy.next;
    }
}