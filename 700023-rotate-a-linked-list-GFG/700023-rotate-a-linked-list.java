class Solution {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null) return head;

        int len = 1;
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k %= len;
        if (k == 0) return head;

        tail.next = head;

        Node newTail = head;
        for (int i = 1; i < k; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna