class SpecialStack {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public SpecialStack() {
        // Define Stack
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        st1.push(x);
        if(st2.isEmpty() || x <= st2.peek()){
            st2.push(x);
        }
        
    }

    public void pop() {
        // Remove the top element from the Stack
        if(st1.isEmpty()) return;
        
        if(st1.peek().equals(st2.peek())){
            st1.pop();
            st2.pop();
        }
        else{
            st1.pop();
        }
        
    }

    public int peek() {
        // Returns top element of the Stack
        return (!st1.isEmpty()) ? st1.peek() : -1;
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return st1.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        return st2.isEmpty() ? -1 : st2.peek();
    }
}