class Solution {
    public Node insertPos(Node head, int pos, int val) {

        Node newNode = new Node(val);

        // Insert at first position
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        // Move to position before pos
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        // Insert node
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna