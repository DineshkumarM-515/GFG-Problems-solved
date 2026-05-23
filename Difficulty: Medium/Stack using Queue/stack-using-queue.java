class myStack {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        // Inserts an element x at the top of the stack
        q.offer(x);
    }

    void pop() {
        // Removes an element from the top of the stack
        Queue<Integer> q2 = new LinkedList<>();
        int size = q.size();
        for(int i=0;i<size;i++){
            if(i == size-1){
                q.poll();
            }
            else{
                q2.offer(q.poll());
            }
        }
        
        while(!q2.isEmpty()){
            q.offer(q2.poll());
        }
        
    }

    int top() {
        // Returns the top element of the stack
        // If stack is empty, return -1
        if(q.isEmpty()) return -1;
        
        Queue<Integer> q2 = new LinkedList<>();
        int top = 0;
        int size = q.size();
        for(int i=0;i<size;i++){
            if(i == size-1){
                top = q.poll();
                q2.offer(top);
            }
            else{
                q2.offer(q.poll());
            }
        }
        
        while(!q2.isEmpty()){
            q.offer(q2.poll());
        }
        
        return top;
    }

    int size() {
        // Returns the current size of the stack
        return q.size();
    }
}
