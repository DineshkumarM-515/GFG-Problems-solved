/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newnode = new Node(x);
        if(head == null){
            return newnode;
        }
        if(head.next == null){
            head.next = newnode;
            return head;
        }
        
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        int mid = (count+1)/2;
        Node fast = head;
        
        for(int i=1;i<mid;i++){
            fast = fast.next;
        }
        
        newnode.next = fast.next;
        fast.next = newnode;
        
        return head;
    }
}