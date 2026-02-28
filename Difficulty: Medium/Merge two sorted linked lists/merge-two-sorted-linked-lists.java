/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dummy = new Node(0);
        Node prev = dummy;
        
        Node temp1 = head1;
        Node temp2 = head2;
        
        while(temp1 != null && temp2 != null){
            Node next1 = temp1.next;
            Node next2 = temp2.next;
            if(temp1.data < temp2.data){
                prev.next = temp1;
                prev = prev.next;
                prev.next = null;
                temp1 = next1;
            }
            else{
                prev.next = temp2;
                prev = prev.next;
                prev.next = null;
                temp2 = next2;
            }
        }
        
        while(temp1 != null){
            prev.next = temp1;
            prev = prev.next;
            temp1 = temp1.next;
        }
        
        while(temp2 != null){
            prev.next = temp2;
            prev = prev.next;
            temp2 = temp2.next;
        }
        
        return dummy.next;
    }
}