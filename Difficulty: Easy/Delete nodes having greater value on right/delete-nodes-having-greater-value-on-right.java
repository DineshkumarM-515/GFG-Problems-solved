class Solution {
    Node reverse(Node head){
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
    Node compute(Node head) {
        if(head == null || head.next == null) return head;
        
        head = reverse(head);
        
        Node curr = head;
        Node prev = head;
        int max =  curr.data;
        Node newHead = head;
        while(curr != null){
            if(curr.data < prev.data){
                prev.next = curr.next;
            }
            else{
                max = curr.data;
                prev = curr;
            }
            curr = curr.next;
        }
        
        head = reverse(newHead);
        
        return head;
    }
}