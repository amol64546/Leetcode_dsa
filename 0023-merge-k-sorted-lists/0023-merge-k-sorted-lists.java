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
    class Pair{
        ListNode node;
        int val;
        Pair(ListNode node, int val){
            this.node = node;
            this.val = val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Pair> min = new PriorityQueue<>((a,b)-> a.val - b.val );
        
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        
        for(int i=0; i<lists.length; i++){
            if(lists[i] != null)
                min.offer(new Pair(lists[i],lists[i].val));
            }
        
        while(!min.isEmpty()){
            Pair curr = min.poll();
            temp.next = curr.node;
            temp = temp.next;
            if(temp.next != null){
                min.offer(new Pair(temp.next,temp.next.val));
            }
        }
        return dummy.next;
    }
}