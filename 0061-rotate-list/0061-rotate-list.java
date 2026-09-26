class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode start = head;
        ListNode fast = head;

        // Length find karna
        int length = 1;

        while (fast.next != null) {
            fast = fast.next;
            length++;
        }

        // k ko reduce karna
        k = k % length;

        if (k == 0) {
            return head;
        }

        // Last node ko head se connect karo
        fast.next = head;

        // New tail find karo
        int steps = length - k;

        for (int i = 1; i < steps; i++) {
            start = start.next;
        }

        // start ke next ko new head bana do
        ListNode newHead = start.next;

        // Circle tod do
        start.next = null;

        return newHead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna