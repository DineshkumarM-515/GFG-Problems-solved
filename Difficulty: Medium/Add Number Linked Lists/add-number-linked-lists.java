/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node revHead1 = reverse(head1);
        Node revHead2 = reverse(head2);
        
        int carry = 0;
        Node temp1 = revHead1;
        Node temp2 = revHead2;
        
        Node dummy = new Node(0);
        Node nn = dummy;
        while(temp1 != null || temp2 != null || carry != 0){
            int sum = 0;
            if(temp1 != null){
                sum += temp1.data;
                temp1 = temp1.next;
            }
            
            if(temp2 != null){
                sum += temp2.data;
                temp2 = temp2.next;
            }
            
            sum += carry;
            nn.next = new Node(sum % 10);
            carry = sum / 10;
            nn = nn.next;
        }
        
        Node FinalList = reverse(dummy.next);
        
        Node res = FinalList;
        while(res != null && res.data == 0 && res.next != null){
            res = res.next;
        }
        
        return res;
        
    }
}