class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int srow = 0;
        int scol = 0;
        int erow = matrix.length - 1;
        int ecol = matrix[0].length - 1;

        while (srow <= erow && scol <= ecol) {

            for (int j = scol; j <= ecol; j++) {
                ans.add(matrix[srow][j]);
            }

            for (int i = srow + 1; i <= erow; i++) {
                ans.add(matrix[i][ecol]);
            }

            if (srow != erow) {
                for (int j = ecol - 1; j >= scol; j--) {
                    ans.add(matrix[erow][j]);
                }
            }

            if (scol != ecol) {
                for (int i = erow - 1; i >= srow + 1; i--) {
                    ans.add(matrix[i][scol]);
                }
            }

            srow++;
            scol++;
            erow--;
            ecol--;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna