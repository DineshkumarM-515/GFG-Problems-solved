class Solution {
    public static int precedence(char op){
        if(op == '^') return 3;
        if(op == '/' || op == '*') return 2;
        if(op == '+' || op == '-') return 1;
        
        return 0;
    }
    public static String infixToPostfix(String s) {
        // code here
        String postfix = "";
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(Character.isLetterOrDigit(c)){
                postfix += c;
            }
            else if(c == '('){
                st.push(c);
            }
            else if(c == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    postfix += st.pop();
                }
                if(!st.isEmpty())st.pop();
            }
            else{ 
              while(!st.isEmpty() && precedence(st.peek()) >= precedence(c)){
                if(c == '^' && st.peek() == '^'){
                    break;
                }
                postfix += st.pop();
            }
            st.push(c);
            }
        }
        
        while(!st.isEmpty()){
            postfix += st.pop();
        }
        
        return postfix;
        
    }
}