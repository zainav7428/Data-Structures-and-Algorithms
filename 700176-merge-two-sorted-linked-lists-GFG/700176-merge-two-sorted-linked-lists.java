/*  Structure of Linked List Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} */

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node temp1 = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp1.next = head1;
                head1 = head1.next;
            } else {
                temp1.next = head2;
                head2 = head2.next;
            }

            temp1 = temp1.next;
        }

        if (head1 != null) {
            temp1.next = head1;
        }

        if (head2 != null) {
            temp1.next = head2;
        }

        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna