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
    public TreeNode dfs(TreeNode root){
		if(root==null) return root;
        
		TreeNode leftTail = dfs(root.left);
		TreeNode rightTail = dfs(root.right);
        
		if(leftTail!=null){
			leftTail.right = root.right;
			root.right = root.left;
			root.left = null;
		}
        
		if(rightTail!=null)
			return rightTail;
		else if(leftTail!=null)
			return leftTail;
		return root;
	}
    public void flatten(TreeNode root) {
        dfs(root);
    }
}