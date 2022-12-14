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
    
    public int helper(TreeNode child, TreeNode parent,TreeNode grandparent){
        if(child==null) return 0;
        int sum=0;
        if(grandparent!=null && grandparent.val%2==0)
            sum += child.val;
        return sum + helper(child.left, child, parent)+
                    helper(child.right, child, parent);
        
    }
    
    public int sumEvenGrandparent(TreeNode root) {
        return helper(root,null, null);
        
    }
}