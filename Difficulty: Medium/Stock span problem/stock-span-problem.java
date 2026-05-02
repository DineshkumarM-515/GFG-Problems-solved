class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> idxs = new Stack<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            while(!idxs.isEmpty() && arr[idxs.peek()] <= arr[i]){
                idxs.pop();
            }
            
            if(!idxs.isEmpty()) ans.add(i-idxs.peek());
            else ans.add(i,i+1);
            
            idxs.push(i);
        }
        
        return ans;
        
    }
}