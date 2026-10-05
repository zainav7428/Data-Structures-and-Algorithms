/*
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // code here
        if (head == null) {
                   return true;
               }
       
      Node slow = head;
             Node fast = head;

             while (fast != null && fast.next != null) {

                 slow = slow.next;
                 fast = fast.next.next;

                 if (slow == head || fast == head) {
                     return true;
                 }
             }

             return false;
         
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna