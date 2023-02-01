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
         ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        Queue<ListNode> q = new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode node: lists){
            if(node!=null)
                q.offer(node);
        }
        while(q.size()>0){
            ListNode node = q.poll();
            temp.next = node;
            temp = node;
            if(node.next!=null){
                q.offer(node.next);
            }
        }
        return dummy.next;
    }
}