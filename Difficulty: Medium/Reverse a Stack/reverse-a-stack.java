class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        Stack<Integer> rev = new Stack<>();
        while(!st.isEmpty()){
            rev.push(st.pop());
        }
        
        Stack<Integer> rev2 = new Stack<>();
        while(!rev.isEmpty()){
            rev2.push(rev.pop());
        }
        
        while(!rev2.isEmpty()){
            st.push(rev2.pop());
        }
        
    }
}
