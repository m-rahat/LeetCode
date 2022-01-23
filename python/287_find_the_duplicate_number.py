from typing import List

class Solution:
    '''
        This solution below satisfies the not modifying array and using constant extra space
        However, it is O(n.logn) since i'm using sort first
    '''
    def findDuplicate(self, nums: List[int]) -> int:
        n = len(nums)
        res = 0
        nums.sort()
        for i in range(n - 1):
            if nums[i] ^ nums[i+1] == 0:
                return nums[i]
        return 0

a = Solution()
nums = [1,3,4,2,2]
print(a.findDuplicate(nums))
