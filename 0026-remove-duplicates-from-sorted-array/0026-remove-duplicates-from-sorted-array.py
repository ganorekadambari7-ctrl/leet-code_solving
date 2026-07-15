class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
     i,j=0,1
     while i<=j and j<len(nums):
        if nums[i]==nums[j]:
            j+=1
        else:
            nums[i+1]=nums[j]
            i+=1
     return i+1
        

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna