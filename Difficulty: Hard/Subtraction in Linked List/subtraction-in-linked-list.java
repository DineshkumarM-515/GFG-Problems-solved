/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    static Node reverse(Node list){
        Node prev = null;
        Node curr = list;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    static Node removeLeadingZero(Node head){
        while(head != null && head.data == 0){
            head = head.next;
        }
        return (head == null) ? new Node(0):head;
    }
    
    static int length(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        return count;
    }
    
    static int compare(Node head1,Node head2){
        int l1 = length(head1);
        int l2 = length(head2);
        
        if(l1 < l2) return -1;
        if(l1 > l2) return 1;
        
        while(head1 != null && head2 != null){
            if(head1.data > head2.data) return 1;
            if(head1.data < head2.data) return -1;
            
            head1 = head1.next;
            head2 = head2.next;
            
        }
        return 0;
    }
    
    static Node[] isSwapRequired(Node head1,Node head2){
        Node n1 = removeLeadingZero(head1);
        Node n2 = removeLeadingZero(head2);
        
        int cmp = compare(n1,n2);
        if(cmp < 0){
            return new Node[]{head2,head1};
        }
        else{
            return new Node[]{head1,head2};
        }
    }
    
    static Node subLinkedList(Node head1, Node head2) {
        // code here
        Node[] swap = isSwapRequired(head1,head2);
        
        head1 = swap[0];
        head2 = swap[1];
        
        Node temp1 = reverse(head1);
        Node temp2 = reverse(head2);
        
        Node dummy = new Node(0);
        Node curr = dummy;
        int borrow = 0;
        
        while(temp1 != null){
            int val1 = temp1.data;
            int val2 = (temp2 != null) ? temp2.data:0;
            
            int diff = val1 - val2 - borrow;
            if(diff < 0){
                diff += 10;
                borrow = 1;  
            }
            else{
                borrow = 0;
            }
            
            curr.next = new Node(diff);
            curr = curr.next;
            
            temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }
        
        Node ans = reverse(dummy.next);
        ans = removeLeadingZero(ans);
        return ans;
    }
}