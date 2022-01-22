from typing import List

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums.sort()
        maxNum = 1
        n = len(nums)
        if n == 0:
            return 0
        if n == 1:
            return 1
        for i in range(n):
            count = 1
            for j in range(i, n):
                if j+1 >= n:
                    return maxNum
                elif nums[j] == nums[j + 1]:
                    print("here")
                elif nums[j] + 1 == nums[j + 1]:
                    count = count + 1
                    if maxNum < count:
                        maxNum = count
                else:
                    count = 1
        return maxNum

a = Solution()
# input = [100,4,200,1,3,2]
# input = [9,1,4,7,3,-1,0,5,8,-1,6]
input = [1,2,0,1]
print(a.longestConsecutive(input))