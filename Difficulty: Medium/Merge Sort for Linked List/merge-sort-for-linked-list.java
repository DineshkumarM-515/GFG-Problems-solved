/*
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node mergeSort(Node head) {
        // code here
        if(head == null || head.next == null){
            return head;
        }
        Node mid = midPoint(head);
        Node rightMid = mid.next;
        mid.next = null;
        
        Node left = mergeSort(head);
        Node right = mergeSort(rightMid);
        
        
        return merge(left,right);
        
    }
    
    public Node midPoint(Node head){
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public Node merge(Node left,Node right){
        Node dummy = new Node(0);
        Node tail = dummy;
        
        while(left != null && right != null){
            if(left.data < right.data){
                tail.next = left;
                left = left.next;
            }
            else{
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        
        if(left != null){
            tail.next = left;
        }
        else{
            tail.next = right;
        }
        
        return dummy.next;
    }
}