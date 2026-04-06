class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                if(!match(st.pop(),c)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    
    public boolean match(char start, char end){
        return ((start == '[' && end == ']') || (start == '(' && end == ')') || (start == '{' && end == '}'));
    }
}
