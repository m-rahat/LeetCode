# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        queue = []
        store = []
        level = 1
        queue.append(root)
        while queue:
            temp = []
            while queue:
                node = queue.pop(0)
                if node == None:
                    return 0
                # return depth level at the first sight of leaf node
                if node.left == None and node.right == None:
                    store.append(level)
                else:
                    if node.left != None:
                        temp.append(node.left)
                    if node.right != None:
                        temp.append(node.right)
            level+= 1
            queue = temp
        return min(store)
                