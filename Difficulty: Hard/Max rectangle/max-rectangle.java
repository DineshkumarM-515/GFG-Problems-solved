class Solution {
    static int maxArea(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        int[] histogram = new int[m];
        int maxArea = 0;
        
        for(int  i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1){
                    histogram[j]++;
                }
                if(mat[i][j] == 0){
                    histogram[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, maxHistogram(histogram));
        }
        
        return maxArea;
        
    }
    
    static int maxHistogram(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        int maxArea = 0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                int height = arr[st.pop()];
                int width = (st.isEmpty()) ? i : i-st.peek()-1;
                
                maxArea = Math.max(maxArea, width*height);
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            int height2 = arr[st.pop()];
            int left2 = (st.isEmpty()) ? -1 : st.peek();
            int width2 = n - left2 - 1;

            maxArea = Math.max(maxArea, height2*width2);
        }
        
        return maxArea;
    }
}