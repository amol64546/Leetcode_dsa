# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorder(self,root,output):
        if not root: return        
        self.inorder(root.left,output)        
        output.append(root.val)
        self.inorder(root.right,output)

    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        mini = 100000
       
        output = []
        self.inorder(root,output)  
        
        for i in range(1,len(output)):
            mini = min(mini,output[i]-output[i-1])
        
        return mini
    
    
        