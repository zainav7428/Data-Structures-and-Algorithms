/*
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    public static Node moveToFront(Node head) {
        // code here
       if(head == null || head.next== null){
           return head;
       }
       
       Node first = head;
       Node prev = null;
       
       while(first.next!=null){
           prev = first ;
           first = first.next;
       }
       prev.next=null;
       first.next = head;
       head = first;
       
       return head;
}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna