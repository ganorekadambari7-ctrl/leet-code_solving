class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int j = 0; j < n; j++) {
            dp[0][j] = grid[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {

                dp[i][j] = Integer.MAX_VALUE;

                for (int k = 0; k < n; k++) {

                    int prevValue = grid[i - 1][k];

                    int cost = dp[i - 1][k]
                             + moveCost[prevValue][j]
                             + grid[i][j];

                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, dp[m - 1][j]);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna