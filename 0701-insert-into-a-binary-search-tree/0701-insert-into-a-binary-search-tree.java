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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newnode = new TreeNode(val);
        TreeNode curr=root, parent=null;
        if(root==null) return newnode;
        while(curr!=null){
            parent=curr;
            if(val< curr.val )
                curr=curr.left;
            else
                curr=curr.right;
        }
        if(val<parent.val)
            parent.left=newnode;
        else
            parent.right=newnode;
        return root;
    }
}