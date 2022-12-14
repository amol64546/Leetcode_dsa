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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root,list,0);
        return list;
        
    }
    
    void helper(TreeNode root, ArrayList list, int level){
        if(root==null) return;
        if( level == list.size())
            list.add(root.val);
        helper(root.right,list, level+1);
        helper(root.left,list, level+1);
    }
}