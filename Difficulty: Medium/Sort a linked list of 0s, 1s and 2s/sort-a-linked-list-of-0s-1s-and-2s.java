/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head== null || head.next == null) return head;
        Node ZeroDummy = new Node(0);
        Node OneDummy = new Node(0);
        Node TwoDummy = new Node(0);
        
        Node zero = ZeroDummy;
        Node one = OneDummy;
        Node two = TwoDummy;
        
        
        Node temp = head;
        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }
            else{
                two.next = temp;
                two = two.next;
            }
            
            temp = temp.next;
        }
        
        one.next = TwoDummy.next;
        zero.next = (OneDummy.next != null) ? OneDummy.next : TwoDummy.next;
        two.next = null;
        
        return ZeroDummy.next;
        
    }
}