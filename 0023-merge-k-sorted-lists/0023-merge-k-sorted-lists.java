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
    ListNode mergeTwoLinkedList(ListNode l1,ListNode l2){
       if(l1==null){
        return l2;
       } 
       if(l2 == null){
        return l1;
       }
       if(l1.val<=l2.val){
        l1.next = mergeTwoLinkedList(l1.next,l2);

        return l1;
       }else{
        l2.next = mergeTwoLinkedList(l2.next,l1);

        return l2;
       }
      
    }



    ListNode partitionAndMerge(int start,int end,ListNode[] lists){
       
       if(start>end) return null;
        if(start == end) return lists[start];
        int mid = start+(end-start)/2;

        ListNode L1 =  partitionAndMerge(start,mid,lists);
        ListNode L2 =   partitionAndMerge(mid+1,end,lists);

return mergeTwoLinkedList(L1,L2);

    }
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if(k==0) return null;
        return  partitionAndMerge(0,k-1,lists);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna