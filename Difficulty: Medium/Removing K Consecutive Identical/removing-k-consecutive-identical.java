class Solution {
    static class Pair{
        char ch;
        int cnt;
        
        Pair(char ch, int cnt){
            this.ch = ch;
            this.cnt = cnt;
        }
    }
    public static String reducedString(int k, String s) {
        // code here
        if(k == 1) return "";
        Stack<Pair> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(!st.isEmpty() && st.peek().ch == c){
                st.peek().cnt++;
            
                if(st.peek().cnt == k){
                    st.pop();
                }
            }
            else{
                st.push(new Pair(c,1));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            for(int i=0;i<st.peek().cnt;i++){
                sb.append(st.peek().ch);
            }
            st.pop();
        }
        
        return sb.reverse().toString();
    }
}