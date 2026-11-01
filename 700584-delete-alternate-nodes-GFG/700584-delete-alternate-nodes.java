/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    Node deleteAlt(Node head) {

        if (head == null) {
            return null;
        }

        Node current = head;

        while (current != null && current.next != null) {
            current.next = current.next.next;
            current = current.next;
        }

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna