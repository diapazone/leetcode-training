class Solution:
    def canJump(self, nums: List[int]) -> bool:
        jump = nums[0]
        for num in nums:
            if jump == 0:
                return False
            if num > jump:
                jump = num
            else:
                jump-=1
        return True