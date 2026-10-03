/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // ListNode temp1 = headA;
        // ListNode temp2 = headB;

        // while (temp1 != temp2) {

        //     if (temp1 == null) {
        //         temp1 = headB;
        //     } else {
        //         temp1 = temp1.next;
        //     }

        //     if (temp2 == null) {
        //         temp2 = headA;
        //     } else {
        //         temp2 = temp2.next;
        //     }
        // }

        // return temp1;



int lenA = 0;
ListNode temp1 = headA;

while (temp1 != null) {
    lenA++;
    temp1 = temp1.next;
}

int lenB = 0;
ListNode temp2 = headB;

while (temp2 != null) {
    lenB++;
    temp2 = temp2.next;
}

// Reset both pointers
temp1 = headA;
temp2 = headB;

if (lenA > lenB) {

    int diff = lenA - lenB;

    while (diff > 0) {
        temp1 = temp1.next;
        diff--;
    }

} else {

    int diff = lenB - lenA;

    while (diff > 0) {
        temp2 = temp2.next;
        diff--;
    }
}

// Now both have same remaining length
while (temp1 != temp2) {
    temp1 = temp1.next;
    temp2 = temp2.next;
}

return temp1;




    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna