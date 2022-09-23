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
    public boolean isPalindrome(ListNode head) {
        int l=0, r=0;
        int i = 1;
        while(head!=null){
            l = l*10 + head.val;    // normal
            r = r+ head.val * i;   // reverse
            i*=10;
            head = head.next;
        }
        
        return (r==l);
    }
}