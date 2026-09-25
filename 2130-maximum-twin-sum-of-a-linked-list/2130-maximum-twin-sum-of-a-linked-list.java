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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int sum = 0;
    
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
       ListNode prev = null;
       ListNode curr = slow;
    //    slow.next = null;

       while(curr!=null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
int maxSum = 0;
       ListNode second = prev;
       ListNode first = head;

       while(second!=null){
         sum = first.val +second.val;
        maxSum = Math.max(maxSum,sum);

        first = first.next;
        second = second.next;
       }

        return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna