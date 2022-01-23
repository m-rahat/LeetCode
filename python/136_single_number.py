from typing import List

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        res = 0
        for num in nums:
            res = res ^ num
        return res
        

a = Solution()
input = [0,1]
print(a.missingNumber(input))
