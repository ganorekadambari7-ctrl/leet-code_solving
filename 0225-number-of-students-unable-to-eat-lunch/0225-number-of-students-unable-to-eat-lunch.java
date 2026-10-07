class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0, one = 0;

        for (int student : students) {
            if (student == 0)
                zero++;
            else
                one++;
        }

        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (zero == 0)
                    break;
                zero--;
            } else {
                if (one == 0)
                    break;
                one--;
            }
        }

        return zero + one;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna