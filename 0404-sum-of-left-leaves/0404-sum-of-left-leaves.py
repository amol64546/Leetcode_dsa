# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def helper(self,root,flag):
        
        if not root:
            return 0
        
        
        if not root.left and not root.right:
            return root.val if flag else 0
            
        return self.helper(root.left,True) + self.helper(root.right,False)
        
        
        
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        return self.helper(root,False)
        