class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        int[] arr = new int[st.size()];
        int k = 0;
        
        while(!st.isEmpty()){
            arr[k++] = st.pop();
        }
        
        Arrays.sort(arr);
        
        for(int num:arr){
            st.push(num);
        }
        
    }
}