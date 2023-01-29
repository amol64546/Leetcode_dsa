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

class BSTIterator{
    Stack<TreeNode> st = new Stack<>();
    boolean reverse = true;
    
    BSTIterator(TreeNode root, boolean isReverse){        
        reverse = isReverse;
        pushAll(root);
    }
    
    public int next(){        
        TreeNode curr = st.pop();
        if(reverse) pushAll(curr.left);
        else pushAll(curr.right);
        return curr.val;
    }
    
    public void pushAll(TreeNode curr){
        while(curr!=null){
            st.push(curr);
            if(reverse) curr=curr.right;
            else curr=curr.left;
        }
    }
    
    public boolean hasNext(){
        return !st.empty();
    }
}

class Solution {
    public boolean findTarget(TreeNode root, int k) {
       
        BSTIterator l = new BSTIterator(root,false);
        BSTIterator r = new BSTIterator(root,true);
        
        int i = l.next();
        int j = r.next(); // r.before()
        while(i<j){
            int sum = i+j;
            if(sum==k) return true;
            if(sum<k) i = l.next();
            else j = r.next();
        }
        return false;
    }
}