/*
Definition for Node
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
    
    static class Pair{
        Node node;
        int dist;
        Pair(Node n, int dist){
            this.node = n;
            this.dist = dist;
        }
    }
    
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            Node curr = p.node;
            int dist = p.dist;
            
            map.putIfAbsent(dist, new ArrayList<>());
            map.get(dist).add(curr.data);
            
            if(curr.left != null){
                q.add(new Pair(curr.left, dist-1));
            }
            if(curr.right != null){
                q.add(new Pair(curr.right, dist+1));
            }
        }
        
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        for(ArrayList<Integer> col : map.values()){
            li.add(col);
        }
        
        return li;
    }
}