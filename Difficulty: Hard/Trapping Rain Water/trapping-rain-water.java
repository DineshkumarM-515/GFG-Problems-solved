class Solution {
    public int maxWater(int arr[]) {
        // code here
        int water = 0; //Answer variable
        Stack<Integer> st = new Stack<>();
        
        int n = arr.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                int bottom = st.pop();
                
                if(st.isEmpty()) break;
                
                int leftSide = st.peek();
                int rightSide = i;
                
                int height = Math.min(arr[leftSide],arr[rightSide]) - arr[bottom];
                int distance = i-leftSide-1;
                water += height * distance;
            }
            st.push(i);
        }
        
        return water;
        
        
    }
}
