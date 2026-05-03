class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count = 0
        for num in nums:
            digit = len(str(num))
        
            if digit % 2 == 0:
                count+=1
        return count
        