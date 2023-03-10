# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def validate(self,root,min,max):
        if not root:
            return True
        # if root.val<min or root.val>max:
        #     return False
        return min<root.val<max and self.validate(root.left,min,root.val) and self.validate(root.right,root.val,max)
    
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.validate(root,float('-inf'),float('inf'))
        