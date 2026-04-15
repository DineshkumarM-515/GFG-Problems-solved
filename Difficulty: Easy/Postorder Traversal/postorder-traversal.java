/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> postorder = new ArrayList<>();
        postOrderHelper(root,postorder);
        
        return postorder;
    }
    
    void postOrderHelper(Node root, ArrayList<Integer> li){
        if(root == null) return;
        postOrderHelper(root.left,li);
        postOrderHelper(root.right,li);
        li.add(root.data);
    }
}