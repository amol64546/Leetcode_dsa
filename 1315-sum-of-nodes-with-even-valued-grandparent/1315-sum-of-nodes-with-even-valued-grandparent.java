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
    
    public void helper(TreeNode child, TreeNode parent,TreeNode grandparent){
        if(child==null) return;
        
        if(grandparent!=null && grandparent.val%2==0)
            sum+= child.val;
        helper(child.left, child, parent);
        helper(child.right, child, parent);
        
    }
    
    int sum=0;
    
    public int sumEvenGrandparent(TreeNode root) {
        helper(root,null, null);
        return sum;
    }
}