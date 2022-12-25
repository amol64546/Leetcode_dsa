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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list = new ArrayList<>();
            Queue<TreeNode> q = new ArrayDeque<>();            
            q.offer(root);
            while(!q.isEmpty()){
                    int n = q.size();
				double sum=0;
                    for(int i=0; i<n; i++){
                            TreeNode temp = q.poll();
                            if(temp.left!=null)
                                    q.offer(temp.left);
                            if(temp.right!=null)
                                    q.offer(temp.right);
                            sum+= temp.val;
                    }
				list.add(sum/n);
                    
            }
		
            return list;
    }
}