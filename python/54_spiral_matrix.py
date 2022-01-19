from typing import List

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rowLen = len(matrix)
        colLen = len(matrix[0])
        returnList = []
        count = rowLen * colLen

        iter = 0
        row = 0
        col = 0
        while iter != count:
            #going right
            for i in range(row, colLen):
                returnList.append(matrix[row][i])
                iter = iter + 1
                if iter == count:
                    return returnList

            # going down
            for i in range(row+1, rowLen):
                returnList.append(matrix[i][colLen - 1])
                iter = iter + 1
                if iter == count:
                    return returnList
            
            # going left
            for i in range(colLen - 2, row-1, -1):
                returnList.append(matrix[rowLen - 1][i])
                iter = iter + 1
                if iter == count:
                    return returnList

            # going up
            for i in range(rowLen - 2, row, -1):
                returnList.append(matrix[i][col])
                iter = iter + 1
                if iter == count:
                    return returnList

            rowLen = rowLen - 1
            colLen = colLen - 1
            row = row + 1
            col = col + 1



matrix = [[1,2,3],[4,5,6],[7,8,9]]
a = Solution()
a.spiralOrder(matrix)