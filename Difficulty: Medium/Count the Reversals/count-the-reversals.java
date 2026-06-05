class Solution {
    public int countMinReversals(String s) {
        // code here
        if(s.length()  % 2 != 0) return -1;
        int open = 0;
        int close = 0;
            
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '{') {
                st.push(c);
            }
                
            if(c == '}'){
               if(!st.isEmpty() && st.peek() == '{'){
                   st.pop();
               }
               else{
                   st.push(c);
               }
            } 
        }
        
         
        // 3 
        // 1
        
        while(!st.isEmpty()){
            char pop = st.pop();
            
            if(pop == '{'){
                open++;
            } 
            else{
                close++;
            } 
        }
        
        
        int ans =  (int) Math.ceil(open/2.0) + (int) Math.ceil(close/2.0);
        
        return ans;
    }
}