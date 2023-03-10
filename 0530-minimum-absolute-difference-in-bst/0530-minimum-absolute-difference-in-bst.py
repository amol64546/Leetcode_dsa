# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    

    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        mini = int(1e5)
        prev = None
       
        
        def inorder(root):
            nonlocal mini,prev
            
            if not root: return        
            inorder(root.left)        
            if prev:
                mini = min(mini,root.val-prev.val)
            prev = root
            inorder(root.right) 
            
        inorder(root)
        
        return mini
    
    
        