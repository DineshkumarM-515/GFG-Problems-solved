/* node class of the linked list

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
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
        if(head == null) return null;
        Node d1 = new Node(0);
        Node d2 = new Node(0);
        Node dummy1 = d1;
        Node dummy2 = d2;
        Node newList = new Node(0);
        int idx = 0;
        Node next = null;
        
        Node curr = head;
        while(curr != null){
            if(idx%2 == 0){
                next = curr.next;
                curr.next = null;
                dummy1.next = curr;
                dummy1 = dummy1.next;
            }
            else{
                next = curr.next;
                curr.next = null;
                dummy2.next=  curr;
                dummy2 = dummy2.next; 
            }
            idx++;
            
            curr = next;
            
        }
        
        Node newNode = newList;
        Node temp1 = d1.next;
        Node temp2 = d2.next;
        Node next1 = null;
        Node next2 = null;
        while(temp1 != null && temp2 != null){
            next1 = temp1.next;
            next2 = temp2.next;
            
            newNode.next = temp2;
            temp2.next = temp1;
            
            newNode = temp1;
            
            newNode.next = null;
            
            temp1 = next1;
            temp2 = next2;
        }
        
        while(temp1!=null){
            newNode.next = temp1;
            newNode = newNode.next;
            temp1 = temp1.next;
        }
        
        while(temp2!=null){
            newNode.next = temp2;
            newNode = newNode.next;
            temp2 = temp2.next;
        }
        
        return newList.next;
    }
}