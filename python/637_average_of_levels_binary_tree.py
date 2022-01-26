
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        #Time to implement a Breadth first approach
        #On each level, find the average
        queue = []
        res = []
        queue.append(root)
        
        while queue:
            summation, count = 0, 0
            temp = []
            while queue:
                node = queue.pop(0)
                summation += node.val
                count += 1
                if node.left != None:
                    temp.append(node.left)
                if node.right != None:
                    temp.append(node.right)
            queue = temp
            res.append(summation/count)
        return res