/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> inorder = new ArrayList<>();
        inOrderHelper(root,inorder);
        return inorder;
    }
    
    void inOrderHelper(Node root, ArrayList<Integer> list){
        if(root == null) return;
        inOrderHelper(root.left,list);
        list.add(root.data);
        inOrderHelper(root.right,list);
    }
}