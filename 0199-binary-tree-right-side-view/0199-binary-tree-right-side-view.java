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
        Map<Integer,Integer> map = new TreeMap<>();
        helper(root,map,0);
        return new ArrayList<>(map.values());
        
    }
    
    void helper(TreeNode root, Map map, int level){
        if(root==null) return;
        map.put(level,root.val);
        helper(root.left,map, level+1);
        helper(root.right,map, level+1);
    }
}