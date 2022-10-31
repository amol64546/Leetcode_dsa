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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          
            
        List<List<Integer>> ans = new ArrayList<>();
         if(root==null) return ans;
        Queue<TreeNode> q1 = new ArrayDeque<>();
            boolean flag=false;  
            q1.offer(root);
       
            while(!q1.isEmpty()){                                                           
                     
                       
                              int n = q1.size();  
                          List<Integer> list = new ArrayList<>();
                         for(int i=0; i<n; i++){
                            TreeNode temp = q1.poll();
                                  if(temp.left!=null)
                                    q1.offer(temp.left);
                            if(temp.right!=null)
                                   q1.offer(temp.right);                           
                            list.add(temp.val); 
                             
                          }
                if(flag){
                    Collections.reverse(list);
                }
                flag = !flag;
                 ans.add(list);                                
                   
    
                }
        return ans;
    }
}