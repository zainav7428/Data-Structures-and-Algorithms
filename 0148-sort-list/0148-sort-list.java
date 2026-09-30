class Solution {
    public ListNode sortList(ListNode head) {

        // 0 or 1 node
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split into two lists
        ListNode second = slow.next;
        slow.next = null;

        // Sort both halves
        ListNode first = sortList(head);
        second = sortList(second);

        // Merge
        return merge(first, second);
    }

    private ListNode merge(ListNode first, ListNode second) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (first != null && second != null) {

            if (first.val < second.val) {
                curr.next = first;
                first = first.next;
            } else {
                curr.next = second;
                second = second.next;
            }

            curr = curr.next;
        }

        if (first != null) {
            curr.next = first;
        }

        if (second != null) {
            curr.next = second;
        }

        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna