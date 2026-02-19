/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
        Node dummy = new Node(0);
        Node curr = dummy;
        TreeSet<Integer> union = new TreeSet<>();
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null && temp2 != null){
            union.add(temp1.data);
            union.add(temp2.data);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        while(temp1 != null){
            union.add(temp1.data);
            temp1 = temp1.next;
        }
        
        while(temp2 != null){
            union.add(temp2.data);
            temp2 = temp2.next;
        }
        
        for(int num:union){
            Node newNode = new Node(num);
            curr.next = newNode;
            curr = curr.next;
        }
        return dummy.next;
    }
}