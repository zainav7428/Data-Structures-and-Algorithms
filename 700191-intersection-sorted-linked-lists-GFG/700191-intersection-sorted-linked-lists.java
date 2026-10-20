class Solution {
    public Node findIntersection(Node head1, Node head2) {

        Node head = null;
        Node tail = null;

        while (head1 != null && head2 != null) {

            if (head1.data == head2.data) {

                Node newNode = new Node(head1.data);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }

                head1 = head1.next;
                head2 = head2.next;
            }
            else if (head1.data < head2.data) {
                head1 = head1.next;
            }
            else {
                head2 = head2.next;
            }
        }

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna