/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static class Pair{
        Node n;
        int hd;
        Pair(Node node, int hd){
            this.n = node;
            this.hd = hd;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        Map<Integer, Integer> li = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            Node n = p.n;
            int idx = p.hd;
            
            li.putIfAbsent(idx, n.data);
            
            if(n.left != null) q.add(new Pair(n.left, idx-1));
            if(n.right != null) q.add(new Pair(n.right, idx+1));
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int value : li.values()){
            ans.add(value);
        }
        
        return ans;
        
    }
}