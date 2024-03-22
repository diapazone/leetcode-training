class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        result = 0
        for i in range(len(prices)):
            if max(prices[i:])-prices[i] > result:
                result = max(prices[i:])-prices[i]
        return result