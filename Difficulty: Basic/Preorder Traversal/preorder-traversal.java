/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> preorder = new ArrayList<>();
        preOrderHelper(root,preorder);
        
        return preorder;
    }
    
    void preOrderHelper(Node root, ArrayList<Integer> list){
        if(root == null) return;
        
        list.add(root.data);
        preOrderHelper(root.left,list);
        preOrderHelper(root.right,list);
    }
}