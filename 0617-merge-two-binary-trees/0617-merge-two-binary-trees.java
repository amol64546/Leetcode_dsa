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
    public TreeNode mergeTrees(TreeNode a, TreeNode b) {
        if(a==null) return b;
		if(b==null) return a;
		a.val += b.val;			
		a.left = mergeTrees(a.left,b.left);
		a.right = mergeTrees(a.right,b.right);		
		return a;
    }
}