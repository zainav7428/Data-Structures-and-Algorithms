class Solution {
    public ListNode insertionSortList(ListNode head) {

        // Empty list or one node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {

            // Next node ko save kar lo
            ListNode next = curr.next;

            // Sorted part ke start se check
            ListNode prev = dummy;

            // Correct position find karo
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // curr ko correct position par insert karo
            curr.next = prev.next;
            prev.next = curr;

            // Next node par jao
            curr = next;
        }

        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna