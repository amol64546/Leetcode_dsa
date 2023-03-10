# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def dfs(self,root):
        if not root: return None
        
        left = self.dfs(root.left)
        right = self.dfs(root.right)
        
        if left:
            left.right = root.right
            root.right = root.left
            root.left = None
            
        if right: return right 
        if left: return left
               
        
        return root

    
    def flatten(self, root: Optional[TreeNode]) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        self.dfs(root)
        