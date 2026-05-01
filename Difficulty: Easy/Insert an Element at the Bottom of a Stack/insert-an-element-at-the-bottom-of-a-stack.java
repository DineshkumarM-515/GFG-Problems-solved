// User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> rev = new Stack<>();
        
        while(!st.isEmpty()){
            rev.push(st.pop());
        }
        
        st.push(x);
        
        while(!rev.isEmpty()){
            st.push(rev.pop());
        }
        
        return st;
    }
}