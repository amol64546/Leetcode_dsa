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
    public boolean isValidBST(TreeNode root) {
        return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
    }
    public boolean helper(TreeNode root, long low, long high){
        if(root==null) return true;
        long curr = root.val;
        
        return (low<=curr && curr<=high) && 
            helper(root.left,low,curr-1) &&
            helper(root.right,curr+1,high);
    }
}