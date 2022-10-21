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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>(); 
        if(root==null) return ans;
        Queue<TreeNode> q = new ArrayDeque<>();
        
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int n = q.size();
            for(int i=0; i<n; i++){
                TreeNode temp= q.poll();                
                list.add(temp.val);
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
            }
            ans.add(list);
            
        }
        return ans;
    }
}