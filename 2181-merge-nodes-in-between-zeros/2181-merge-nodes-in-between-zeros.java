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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode resultDummy = dummy;
        int sum = 0;
       ListNode curr = head.next;
        while(curr!=null){
           if(curr.val==0){
               resultDummy.next = new ListNode(sum);
                resultDummy = resultDummy.next;
                sum = 0;
           }else{
            sum+=curr.val;
           }
           curr=curr.next;
        }
        return dummy.next;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna