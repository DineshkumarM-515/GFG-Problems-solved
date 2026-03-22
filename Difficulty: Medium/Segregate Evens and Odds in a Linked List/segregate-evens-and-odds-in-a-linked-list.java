// User function Template for Java

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
    Node divide(Node head) {
        // code here
       Node evenHead = null , evenTail = null;
       Node oddHead = null, oddTail = null;
        
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next =  null;
            
            if(curr.data % 2 == 0){
                if(evenHead == null){
                    evenHead = evenTail = curr;
                }
                else{
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            }
            else{
                if(oddHead == null){
                    oddHead = oddTail = curr;
                }
                else{
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }
            curr = next;
        }
        
        if(evenTail != null){
            evenTail.next = oddHead;
            return evenHead;
        }
        
        return oddHead;
    }
}