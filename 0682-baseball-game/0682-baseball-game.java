class Solution {
    public int calPoints(String[] ops) {
        int[] stack = new int[ops.length];
        int top = 0;

        for (String op : ops) {

            if (op.equals("C")) {
                top--;

            } else if (op.equals("D")) {
                stack[top] = 2 * stack[top - 1];
                top++;

            } else if (op.equals("+")) {
                stack[top] = stack[top - 1] + stack[top - 2];
                top++;

            } else {
                stack[top] = Integer.parseInt(op);
                top++;
            }
        }

        int sum = 0;

        for (int i = 0; i < top; i++) {
            sum += stack[i];
        }

        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna