/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}.

 
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode head;
    int count;
      Random random = new Random();

    public Solution(ListNode head) {
        this.head = head;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

      
    }
    
    public int getRandom() {
        int index = random.nextInt(count);
        ListNode temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
       return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna