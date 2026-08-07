/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        boolean isLeaf(Node root){
            return (root.left == null && root.right == null);
        }
        
        void addLeftNodes(Node node){
            Node curr = node.left;
            while(curr != null){
                if(!isLeaf(curr)) ans.add(curr.data);
                if(curr.left != null) curr = curr.left;
                else curr = curr.right;
            }
        }
        
        void addLeaves(Node node){
            if(node == null) return;
            
            Stack<Node> st = new Stack<>();
            st.push(node);
            
            while(!st.isEmpty()){
                Node curr = st.pop();
                if(isLeaf(curr)){
                    ans.add(curr.data);
                }
                if(curr.right != null) st.push(curr.right);
                if(curr.left != null) st.push(curr.left);
            }
        }
        
        void addRightNodes(Node node){
            Node curr = node.right;
            ArrayList<Integer> temp = new ArrayList<>();
            while(curr != null){
                if(!isLeaf(curr)) temp.add(curr.data);
                if(curr.right != null) curr = curr.right;
                else curr = curr.left;
            }
            
            for(int i = temp.size()-1 ; i>=0;i--){
                ans.add(temp.get(i));
            }
        }
        
        public ArrayList<Integer> boundaryTraversal(Node root) {
            if(root == null) return ans;
            if(!isLeaf(root)) ans.add(root.data);
            else{
                ans.add(root.data);
                return ans;
            }
            
            addLeftNodes(root);
            addLeaves(root);
            addRightNodes(root);
            
            return ans;
        
        }
    
}