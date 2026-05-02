class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> PGE = new Stack<>();
        Stack<Integer> idxs = new Stack<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            while(!PGE.isEmpty() && PGE.peek() <= arr[i]){
                PGE.pop();
                idxs.pop();
            }
            
            if(!idxs.isEmpty()) ans.add(i-idxs.peek());
            else ans.add(i+1);
            
            PGE.push(arr[i]);
            idxs.push(i);
        }
        
        return ans;
        
    }
}