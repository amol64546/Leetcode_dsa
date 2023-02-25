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
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {      
        return construct(preorder,Integer.MAX_VALUE);
    }
    
    public TreeNode construct(int[] arr,int upbound){
        if(i==arr.length || arr[i]>upbound) return null;
        
        TreeNode node = new TreeNode(arr[i++]);
        node.left = construct(arr,node.val);
        node.right = construct(arr,upbound);
        return node;
    }
}