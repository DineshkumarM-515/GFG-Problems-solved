class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                int height = arr[st.pop()];
                
                int left = (st.isEmpty()) ? -1 : st.peek();
                
                int width = i - left - 1;
                
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
                int height = arr[st.pop()];
                
                int left = (st.isEmpty()) ? -1 : st.peek();
                
                int width = n - left - 1;
                
                maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
}
