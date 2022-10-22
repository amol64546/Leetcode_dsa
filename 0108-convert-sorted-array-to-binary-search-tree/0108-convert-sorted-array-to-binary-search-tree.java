/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums,0,nums.length-1);
    }
    
    public TreeNode convert(int[] arr, int l, int r){
        // base case
        if(l>r) return null;
        int mid = l+(r-l)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = convert(arr,l,mid-1);
        node.right = convert(arr,mid+1,r);
        return node;
    }
}