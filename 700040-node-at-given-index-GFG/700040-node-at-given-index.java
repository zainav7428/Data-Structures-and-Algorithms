/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/


class Solution {
    public int getNode(Node head, int k) {

        int index = 1;
        Node first = head;

        while (first != null) {

            if (index == k) {
                return first.data;
            }

            first = first.next;
            index++;
        }

        return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna