/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }

}*/
// you have to complete this function
class GfG {
    public static Node quickSort(Node node) {
        // Your code here
        if(node == null || node.next == null) return node;
        
        Node pivot = node;
        
        Node leftHead = null, leftTail = null;
        Node rightHead = null , rightTail = null;
        
        Node curr = node.next;
        while(curr != null){
            Node next = curr.next;
            curr.next = null;
            
            if(curr.data < pivot.data){
                if(leftHead == null){
                    leftHead = leftTail = curr;
                }
                else{
                    leftTail.next = curr;
                    leftTail = curr; 
                }
            }
            else{
                if(rightHead == null){
                    rightHead = rightTail = curr; 
                }
                else{
                    rightTail.next = curr;
                    rightTail = curr;
                }
            }
            curr = next;
        }
        
        leftHead = quickSort(leftHead);
        rightHead = quickSort(rightHead);
        
        return merge(leftHead,rightHead,pivot);
    }
    
    public static Node merge(Node left,Node right,Node pivot){
        Node newHead = (left != null) ?  left : pivot;
       
        if(left != null) {
            Node tail = left;
            while(tail.next != null) tail = tail.next;
            tail.next = pivot;
        }
        
        pivot.next = right;
        
        return newHead;
        
    }
}