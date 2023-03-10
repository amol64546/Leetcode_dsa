# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def dfs(self,root,level,list):
        if not root: return
        if level == len(list):
            list.append(root.val)
        self.dfs(root.right,level+1,list)
        self.dfs(root.left,level+1,list)
        
        
        
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        
        list = []
        
        self.dfs(root,0,list)
        
        return list
        
        
        