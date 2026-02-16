/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        if(head == null || head.next == null) return head;
        Node curr = head;
        while(curr.next != null){
            if(curr.data == curr.next.data){
                if(curr.next.next == null){
                    curr.next.prev = null;
                    curr.next = null;
                    break;
                }
                else{
                    curr.next.next.prev = curr;
                    curr.next = curr.next.next;
                }
            }
            else curr = curr.next;
        }
        return head;
    }
}