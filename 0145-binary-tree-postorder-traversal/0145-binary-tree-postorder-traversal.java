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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        var st = new Stack<TreeNode>();
        st.push(root);
        while(!st.empty()){
            TreeNode curr = st.pop();
            list.add(0,curr.val);
            if(curr.left!=null)
                st.push(curr.left);
            if(curr.right!=null)
                st.push(curr.right);
        }
        return list;
    }
}