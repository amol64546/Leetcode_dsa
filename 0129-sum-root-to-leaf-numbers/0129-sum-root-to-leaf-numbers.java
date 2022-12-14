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
    
    public int sumNumbers(TreeNode root) {
         return pathSum(root,0);
    }
    
     int pathSum(TreeNode root, int n){
         // return formed root to leaf number
         if(root==null) return 0;
        
         
         // forming root to leaf number
         n = n*10 + root.val;          
          
         // return formed number from leaf node
         if(root.left==null && root.right==null)
             return n;
       
         // return sum of all formed numbers
         return pathSum(root.left,n) + pathSum(root.right,n);
         
        }
}