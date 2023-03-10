# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        q = []
        if root:
            q.append(root)
        res = []
        flag = False
        while q:
            val = []
            
            for i in range(len(q)):
                temp = q.pop(0)
                if temp.left:
                    q.append(temp.left)
                if temp.right:
                    q.append(temp.right)
                val.append(temp.val)
            if flag:
                val.reverse()
            flag = not flag
            res.append(val)
        
        return res
        