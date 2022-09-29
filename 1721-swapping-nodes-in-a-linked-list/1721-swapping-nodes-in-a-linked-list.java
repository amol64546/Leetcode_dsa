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
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        
        // if kth node from start and end is same
        if(k==n-k+1) return head;
       
        
        ListNode curr1=head, curr2=head;
        ListNode prev1=null, prev2=null;        
        
        // reaching at kth node from start
        for(int i=1; i<k; i++){
            prev1=curr1;
            curr1 = curr1.next;
        }
        // reaching at kth node from end
        for(int i=1; i<n-k+1; i++){
             prev2=curr2;
            curr2 = curr2.next;
        }
        
        // swapping
        if(prev1!=null){
            prev1.next = curr2;
        }else{
            head = curr2;
        }
        
        if(prev2!=null){
            prev2.next = curr1;
        }else{
            head = curr1;
        }
        
        temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;
        
        return head;
        
        
        
    }
}