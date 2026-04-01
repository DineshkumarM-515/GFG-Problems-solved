/*
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        HashMap<Node,Node> copy = new HashMap<>();
        Node temp = head;
        
        while(temp != null){
            Node newNode = new Node(temp.data);
            copy.put(temp,newNode);
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null){
            Node curr = copy.get(temp);
            curr.next = copy.get(temp.next);
            curr.random = copy.get(temp.random);
            temp = temp.next;
        }
        
        return copy.get(head);
    }
}