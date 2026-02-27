/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node reverseKGroup(Node head, int k) {
        // code here
        Node dummy = new Node(0);
        dummy.next = head;
        
        Node prevGrpTail = dummy;
        
        Node curr = head;
        while(curr != null){
            Node prev = null;
            Node next = null;
            Node grpStart = curr;
            int count = 0;
            
            while(curr != null && count < k){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            
            prevGrpTail.next =  prev;
            grpStart.next = curr;
            prevGrpTail = grpStart;
        }
        
        return dummy.next;
    }
}