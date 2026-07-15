class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) return head;
        
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        int pos = 0;
        
        // Step 1: Collect values into the stack
        while (temp != null) {
            pos++;
            if (pos >= left && pos <= right) {
                st.push(temp.val);
            }
            temp = temp.next;
        }
        
        // Step 2: Overwrite values from the stack
        temp = head;
        pos = 0;
        while (temp != null) {
            pos++;
            if (pos >= left && pos <= right) {
                temp.val = st.pop();
            }
            temp = temp.next;
        }
        
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna