/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        levelOrderHelper(root,li);
        return li;
    }
    
    void levelOrderHelper(Node root, ArrayList<ArrayList<Integer>> li){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            ArrayList<Integer>subli = new ArrayList<>();
            Node curr = q.poll();
            subli.add(curr.data);
            li.add(subli);
            
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
    }
}