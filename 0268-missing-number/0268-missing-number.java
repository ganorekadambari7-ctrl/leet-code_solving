class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int total = l;
        int summ = 0;
        
        
        for (int i = 0; i < l; i++) {
            total += i;
            summ += nums[i];
        }
        
        
        return total - summ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna