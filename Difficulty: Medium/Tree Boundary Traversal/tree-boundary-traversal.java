/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        Node curr = root;
        ArrayList<Integer> boundary = new ArrayList<>();
        if(root == null) return boundary;
        boundary.add(curr.data);
        if(root.left == null && root.right == null) return boundary;
        
        if(root.left != null){
            curr = root.left;
            while(curr != null){
                if(curr.left != null || curr.right != null) boundary.add(curr.data);
                if(curr.left != null) curr = curr.left;
                else curr = curr.right;
            }
        }
        
        Stack<Node> q = new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            Node f = q.pop();
            if(f.left == null && f.right == null){
                boundary.add(f.data);
            }
            if(f.right != null) q.push(f.right);
            if(f.left != null) q.push(f.left);
        }
        
        Stack<Integer> q2 = new Stack<>();
        curr = root.right;
        while(curr != null){
            if(curr.left != null || curr.right != null) q2.add(curr.data);
            if(curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        
        while(!q2.isEmpty()){
            int val = q2.pop();
            boundary.add(val);
        }
        
        return boundary;
        
    }
}