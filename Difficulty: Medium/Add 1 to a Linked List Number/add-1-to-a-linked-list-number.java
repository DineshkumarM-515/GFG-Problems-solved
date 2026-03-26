/*
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
    public Node addOne(Node head) {
        // code here.
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node reversedHead = prev;
        Node newHead = prev;
        Node lastNode = null;
        int carry = 1;
        while(newHead != null){
            int add = carry+newHead.data;
            newHead.data = add % 10;
            carry = add / 10;
            lastNode = newHead;
            newHead = newHead.next;
            
            if(carry == 0) break;
        }
        
        if(carry > 0){
            lastNode.next = new Node(1);
        }
        
        Node prev2 = null;
        Node curr2 = reversedHead;
        Node next2 = null;
        
        while(curr2 != null){
            next2 = curr2.next;
            curr2.next = prev2;
            prev2 = curr2;
            curr2 = next2;
        }
        
        return prev2;
        
    }
}