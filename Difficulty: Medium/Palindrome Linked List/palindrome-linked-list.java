/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        if(head == null || head.next == null){
            return true;
        }
        Node fast = head;
        Node slow = head;
        Node mid = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            mid = slow;
            slow = slow.next;
        }
        mid.next = null;
        
        Node prev = null;
        Node curr = slow;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node temp1 = head;
        Node temp2 = prev;
        while(temp1 != null && temp2 != null){
            if(temp1.data != temp2.data) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
}