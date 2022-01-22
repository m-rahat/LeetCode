from typing import List
import sys

class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        worker = []
        for num in nums:
            if not num <= 0:
                worker.append(num)
                
        worker.sort()
        nums = worker
        print(nums)

        n = len(nums)
        
        if n == 0:
            return 1

        largest = nums[n-1]
        num_set = set(nums)
        

        print(sys.maxsize)
        for i in range(1,sys.maxsize):
            if i not in num_set:
                return i
            

a = Solution()
# input = [1,2,0]
input = [0]
print(a.firstMissingPositive(input))
