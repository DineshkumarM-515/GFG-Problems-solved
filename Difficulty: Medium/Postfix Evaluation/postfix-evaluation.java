class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(String ch : arr){
            if(ch.equals("+")){
                int op2 = st.pop();
                int op1 = st.pop();
                int ans = op1 + op2;
                st.push(ans);
            }
            else if(ch.equals("-")){
                int op2 = st.pop();
                int op1 = st.pop();
                int ans = op1 - op2;
                st.push(ans);
            }
            else if(ch.equals("*")){
                int op2 = st.pop();
                int op1 = st.pop();
                int ans = op1 * op2;
                st.push(ans);
            }
            else if(ch.equals("/")){
                int op2 = st.pop();
                int op1 = st.pop();
                int ans = Math.floorDiv(op1,op2);
                st.push(ans);
            }
            else if(ch.equals("^")){
                int op2 = st.pop();
                int op1 = st.pop();
                int ans = (int) Math.pow(op1,op2);
                st.push(ans);
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        
        return st.pop();
    }
}