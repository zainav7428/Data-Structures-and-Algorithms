/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        // Step 1: Find length
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: Find minimum size and extra nodes
        int size = length / k;//minimum nodes kitne dene he
        int extra = length % k;//baki 0

        ListNode[] result = new ListNode[k];

        // Step 3: Split the list
        for (int i = 0; i < k; i++) {

            result[i] = head;

            int partSize = size;

            if (extra > 0) {
                partSize++;
                extra--;
            }

            // Move to last node of current part
            for (int j = 1; j < partSize; j++) {
                head = head.next;
            }

            // Break the current part
            if (head != null) {
                ListNode nextPart = head.next;
                head.next = null;
                head = nextPart;
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna