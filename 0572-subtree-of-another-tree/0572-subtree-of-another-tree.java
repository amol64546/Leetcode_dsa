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
    
    public  boolean isSame(TreeNode p, TreeNode q){
                if(p==null && q==null)
                    return true;
                if(p==null || q==null)
                    return false;
                return  ( p.val==q.val) && isSame(p.left,q.left)
                        && isSame(p.right,q.right);
                
        }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        //Write code here
            if(t==null) return true;
            if(s==null) return false;

            if(isSame(s,t)) return true;
            return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
}