/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int count = 0;
        Node first = head;
        
        while(first!=null){
            count++;
            first=first.next;
        }
        
       if (k > count || k <= 0) {
                   return -1;
               }

               // Step 3: Find position from beginning (0-based)
               int pos = count - k;

               // Step 4: Traverse to the required node
               first = head;

               for (int i = 0; i < pos; i++) {
                   first = first.next;
               }

               // Step 5: Return node value
               return first.data;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna