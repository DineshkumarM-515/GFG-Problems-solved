/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean search(Node root, int key) {
        // code here
        Node curr = root;
        
        while(curr != null){
            if(curr.data == key) return true;
            if(curr.data < key){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }
        
        return false;
    }
}