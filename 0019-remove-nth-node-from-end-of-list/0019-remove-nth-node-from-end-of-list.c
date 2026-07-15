struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode dummy;
    dummy.next = head;

    struct ListNode *fast = &dummy;
    struct ListNode *slow = &dummy;

    // Move fast n+1 steps ahead
    for(int i = 0; i <= n; i++) {
        fast = fast->next;
    }

    // Move both pointers
    while(fast != NULL) {
        fast = fast->next;
        slow = slow->next;
    }

    // Delete node
    struct ListNode* temp = slow->next;
    slow->next = temp->next;

    return dummy.next;
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna