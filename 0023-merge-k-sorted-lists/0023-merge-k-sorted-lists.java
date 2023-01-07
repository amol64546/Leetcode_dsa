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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n==0) return null;
        return mergeSort(lists,0,n-1);
    }
    
    public ListNode mergeSort(ListNode[] lists, int s,int e){
        if(s==e) return lists[s];
        int mid = (s+e)/2;
        ListNode left = mergeSort(lists,s,mid);
        ListNode right = mergeSort(lists,mid+1,e);
        return merge(left,right);
    }
    
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        
        temp.next = (l1!=null) ? l1 : l2;
        return dummy.next;
        
        
    }
}