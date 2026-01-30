/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node fast = head;
        Node slow = head;
        boolean Loop = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                Loop = true;
                break;
            }
        }
        if(!Loop) return 0;
        
        int length = 1;
        fast = fast.next;
        
        while(slow != fast){
            length++;
            fast = fast.next;
        }
        return length;
    }
}