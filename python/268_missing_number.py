from typing import List

class Solution:

    '''
        this solution uses o(1) lookup time of set and o(n) runtime
    '''
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        num_set = set(nums)
        for i in range(n + 1):
            if i >= n:
                return i
            if i not in num_set:
                return i




'''
    below solution works with nlogn complexity because of the fact that i used sort
'''
# class Solution:
#     def missingNumber(self, nums: List[int]) -> int:
#         nums.sort()
#         n = len(nums)
#         for i in range(n + 1):
#             if i >= n:
#                 return i
#             if i != nums[i]:
#                 return i
#         return 0
            

a = Solution()
input = [0,1]
print(a.missingNumber(input))
