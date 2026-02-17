/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node next = temp.next;
            temp.next = temp.prev;
            temp.prev = next;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}