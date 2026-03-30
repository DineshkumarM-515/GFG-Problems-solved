/*Node class  used in the program
class Node
{
    int data;
    Node next;
    Node bottom;

    Node(int d)
    {
        data = d;
        next = null;
        bottom = null;
    }
}
*/
/*  Function which returns the  root of
    the flattened linked list. */
class GfG {
    Node merge(Node l1, Node l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        Node dummy = new Node(-1);
        Node curr = dummy;
        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                curr.bottom = l1;
                l1 = l1.bottom;
            }
            else{
                curr.bottom = l2;
                l2 = l2.bottom;
            }
            curr = curr.bottom; 
            curr.next = null;
        }
        
        if(l1 != null) curr.bottom = l1;
        if(l2 != null) curr.bottom = l2;
        
        return dummy.bottom;
    }
    
    Node flatten(Node root) {
        // Base Case
        if(root == null || root.next == null){
            return root;
        }
        
        //call flatten fn recursively
        //This return merged Head when strikes edge case as it calls merge function
        Node mergedHead = flatten(root.next);
        
        //call merge function 
        //To merge the merged flattened list with next 
        root = merge(root,mergedHead);
        
        return root;
    }
}