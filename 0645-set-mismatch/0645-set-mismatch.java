class Solution {

    public int[] findErrorNums(int[] nums) {

        int[] ans = new int[2];

        for(int i = 1; i <= nums.length; i++) {

            int count = 0;

            for(int j = 0; j < nums.length; j++) {

                if(nums[j] == i) {
                    count++;
                }
            }

            if(count == 2) {
                ans[0] = i;
            }

            if(count == 0) {
                ans[1] = i;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna