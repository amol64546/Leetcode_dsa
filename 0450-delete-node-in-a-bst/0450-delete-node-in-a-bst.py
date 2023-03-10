# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderSucc(self,root):
        val = root.val
        while root:
            val = root.val
            root = root.left
        return val
    
    
    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        if not root: return root
        
        # less to left
        if(key<root.val): root.left = self.deleteNode(root.left,key)
        
        # more to right
        elif(key>root.val): root.right = self.deleteNode(root.right,key)
        
        # equal
        else:
        
            # no child
            # one child
            if not root.left: return root.right
            elif not root.right: return root.left            
            
            # two child
            else:
                root.val = self.inorderSucc(root.right)
                root.right = self.deleteNode(root.right,root.val)
        return root
        