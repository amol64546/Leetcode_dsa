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
    public ListNode sortList(ListNode head) {
      if(head==null || head.next==null) return head;
        
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        
        return merge(left,right);
        
        
    }
    
    public ListNode merge(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode();
        
        ListNode temp = dummy;
        while(list1 != null && list2 !=null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;              
            }        
            else{
                temp.next = list2;
                list2 = list2.next;
                
            }
            temp = temp.next;
        }
        
        temp.next = (list1 == null) ? list2 : list1;
      
        return dummy.next;
        
    }
    
    public ListNode getMid(ListNode head){
        ListNode fast=head, slow=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
                       
        }         
        prev.next = null;  //cut the list to two halves
        return slow;
    }
}