class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            boolean[] arr = new boolean[256];

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (arr[ch]) {
                    break;
                }

                arr[ch] = true;
                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna