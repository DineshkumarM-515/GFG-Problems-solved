/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
        
        fast = head;
        while(fast != slow){
            if(fast == null || slow == null) return;
            fast = fast.next;
            slow = slow.next;
        }
        
        while(slow.next != fast){
            slow = slow.next;
        }
        
        slow.next = null;
    }
}