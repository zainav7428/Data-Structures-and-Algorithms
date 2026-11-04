/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    
    static int addCarry(Node head){
        if(head == null){
            return 1;
        }
        
        int res = head.data +addCarry(head.next);
        
        head.data = res %10;
        return res/10;
    }
    public Node addOne(Node head) {
        // code here.
        
        int carry = addCarry(head);
        
        if(carry>0){
            Node newNode = new Node(carry);
            newNode.next = head;
            
            return newNode;
        }
        
        return head;
    }
    
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna